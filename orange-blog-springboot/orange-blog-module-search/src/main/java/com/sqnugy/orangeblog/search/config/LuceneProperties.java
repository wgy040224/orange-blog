package com.sqnugy.orangeblog.search.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName LuceneProperties
 * @description
 * @date 2024-12-13
 */

@ConfigurationProperties(prefix = "lucene")
@Component
@Data
public class LuceneProperties {
    /**
     * 索引存放的文件夹
     */
    private String indexDir;
}