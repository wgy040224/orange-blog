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

    /**
     * 年-月-日 小时-分钟-秒
     */
    DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
}
