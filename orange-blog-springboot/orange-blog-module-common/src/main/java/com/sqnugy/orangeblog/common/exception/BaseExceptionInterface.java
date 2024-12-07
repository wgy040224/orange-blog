package com.sqnugy.orangeblog.common.exception;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName BaseExceptionInterface
 * @description 通用异常接口
 * @date 2024-12-07
 */

public interface BaseExceptionInterface {
    String getErrorCode();

    String getErrorMessage();
}