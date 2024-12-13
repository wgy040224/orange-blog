package com.sqnugy.orangeblog.admin.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName PublishArticleEvent
 * @description
 * @date 2024-12-13
 */

@Getter
public class PublishArticleEvent extends ApplicationEvent {

    /**
     * 文章 ID
     */
    private Long articleId;

    public PublishArticleEvent(Object source, Long articleId) {
        super(source);
        this.articleId = articleId;
    }
}
