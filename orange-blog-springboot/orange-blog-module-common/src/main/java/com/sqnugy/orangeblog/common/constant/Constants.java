package com.sqnugy.orangeblog.common.constant;

import java.time.format.DateTimeFormatter;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName Constants
 * @description
 * @date 2024-12-13
 */

public interface Constants {
    /**
     * 月-日 格式
     */
    DateTimeFormatter MONTH_DAY_FORMATTER = DateTimeFormatter.ofPattern("MM-dd");
}
