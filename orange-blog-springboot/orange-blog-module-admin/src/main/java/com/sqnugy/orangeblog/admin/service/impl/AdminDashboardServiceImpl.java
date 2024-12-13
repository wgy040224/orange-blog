package com.sqnugy.orangeblog.admin.service.impl;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.sqnugy.orangeblog.admin.model.vo.dashboard.FindDashboardStatisticsInfoRspVO;
import com.sqnugy.orangeblog.admin.service.AdminDashboardService;
import com.sqnugy.orangeblog.common.domain.dos.ArticleDO;
import com.sqnugy.orangeblog.common.domain.mapper.ArticleMapper;
import com.sqnugy.orangeblog.common.domain.mapper.CategoryMapper;
import com.sqnugy.orangeblog.common.domain.mapper.TagMapper;
import com.sqnugy.orangeblog.common.utils.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName AdminDashboardServiceImpl
 * @description
 * @date 2024-12-13
 */

@Service
@Slf4j
public class AdminDashboardServiceImpl implements AdminDashboardService {

    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private CategoryMapper categoryMapper;
    @Autowired
    private TagMapper tagMapper;

    /**
     * 获取仪表盘基础统计信息
     *
     * @return
     */
    @Override
    public Response findDashboardStatistics() {
        // 查询文章总数
        Long articleTotalCount = articleMapper.selectCount(Wrappers.emptyWrapper());

        // 查询分类总数
        Long categoryTotalCount = categoryMapper.selectCount(Wrappers.emptyWrapper());

        // 查询标签总数
        Long tagTotalCount = tagMapper.selectCount(Wrappers.emptyWrapper());

        // 总浏览量
        List<ArticleDO> articleDOS = articleMapper.selectAllReadNum();
        Long pvTotalCount = 0L;

        if (!CollectionUtils.isEmpty(articleDOS)) {
            // 所有 read_num 相加
            pvTotalCount = articleDOS.stream().mapToLong(ArticleDO::getReadNum).sum();
        }

        // 组装 VO 类
        FindDashboardStatisticsInfoRspVO vo = FindDashboardStatisticsInfoRspVO.builder()
                .articleTotalCount(articleTotalCount)
                .categoryTotalCount(categoryTotalCount)
                .tagTotalCount(tagTotalCount)
                .pvTotalCount(pvTotalCount)
                .build();

        return Response.success(vo);
    }
}

