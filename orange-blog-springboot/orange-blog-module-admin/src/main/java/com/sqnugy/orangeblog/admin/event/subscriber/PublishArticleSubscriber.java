package com.sqnugy.orangeblog.admin.event.subscriber;

import com.sqnugy.orangeblog.admin.event.PublishArticleEvent;
import com.sqnugy.orangeblog.admin.service.AdminStatisticsService;
import com.sqnugy.orangeblog.common.constant.Constants;
import com.sqnugy.orangeblog.common.domain.dos.ArticleContentDO;
import com.sqnugy.orangeblog.common.domain.dos.ArticleDO;
import com.sqnugy.orangeblog.common.domain.mapper.ArticleContentMapper;
import com.sqnugy.orangeblog.common.domain.mapper.ArticleMapper;
import com.sqnugy.orangeblog.search.LuceneHelper;
import com.sqnugy.orangeblog.search.index.ArticleIndex;
import lombok.extern.slf4j.Slf4j;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.TextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName PublishArticleSubscriber
 * @description
 * @date 2024-12-13
 */

@Component
@Slf4j
public class PublishArticleSubscriber {

    @Autowired
    private LuceneHelper luceneHelper;
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private ArticleContentMapper articleContentMapper;
    @Autowired
    private AdminStatisticsService statisticsService;

    @Async("threadPoolTaskExecutor")
    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void onApplicationEvent(PublishArticleEvent event) {
        // 在这里处理收到的事件，可以是任何逻辑操作
        Long articleId = event.getArticleId();

        // 获取当前线程名称
        String threadName = Thread.currentThread().getName();

        log.info("==> threadName: {}", threadName);
        log.info("==> 文章发布事件消费成功，articleId: {}", articleId);

        // 搜索新发布的文章
        ArticleDO articleDO = articleMapper.selectById(articleId);
        // 这里也将文字正文保存到了文档中，但是检索的时候并没有查询正文，小伙伴们可自行决定是否要将正文，添加到检索字段中
        ArticleContentDO articleContentDO = articleContentMapper.selectByArticleId(articleId);

        // 构建文档
        Document document = new Document();
        document.add(new TextField(ArticleIndex.COLUMN_ID, String.valueOf(articleId), Field.Store.YES));
        document.add(new TextField(ArticleIndex.COLUMN_TITLE, articleDO.getTitle(), Field.Store.YES));
        document.add(new TextField(ArticleIndex.COLUMN_COVER, articleDO.getCover(), Field.Store.YES));
        document.add(new TextField(ArticleIndex.COLUMN_SUMMARY, articleDO.getSummary(), Field.Store.YES));
        document.add(new TextField(ArticleIndex.COLUMN_CONTENT, articleContentDO.getContent(), Field.Store.YES));
        document.add(new TextField(ArticleIndex.COLUMN_CREATE_TIME, Constants.DATE_TIME_FORMATTER.format(articleDO.getCreateTime()), Field.Store.YES));

        // 添加文档
        long count = luceneHelper.addDocument(ArticleIndex.NAME, document);

        log.info("==> 添加文章对应 Lucene 文档结束，articleId: {}，受影响行数: {}", articleId, count);

        // 重新统计各分类下文章总数
        statisticsService.statisticsCategoryArticleTotal();
        log.info("==> 重新统计各分类下文章总数");

        // 重新统计各标签下文章总数
        statisticsService.statisticsTagArticleTotal();
        log.info("==> 重新统计各标签下文章总数");

    }
}
