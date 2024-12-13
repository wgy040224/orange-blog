package com.sqnugy.orangeblog.search.index;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName ArticleIndex
 * @description
 * @date 2024-12-13
 */

public interface ArticleIndex {
    /**
     * 索引名称
     */
    String NAME = "article";

    // --------------------- 文档字段 ---------------------
    String COLUMN_ID = "id";

    String COLUMN_TITLE = "title";

    String COLUMN_COVER = "cover";

    String COLUMN_SUMMARY = "summary";

    String COLUMN_CONTENT = "content";

    String COLUMN_CREATE_TIME = "createTime";
}