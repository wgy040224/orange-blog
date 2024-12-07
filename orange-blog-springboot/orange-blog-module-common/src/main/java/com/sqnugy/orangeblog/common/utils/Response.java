package com.sqnugy.orangeblog.common.utils;

import com.sqnugy.orangeblog.common.exception.BaseExceptionInterface;
import com.sqnugy.orangeblog.common.exception.BizException;
import lombok.Data;

import java.io.Serializable;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName Response
 * @description
 * <p>
 * 本类是一个通用的响应参数工具类，用于封装 API 的响应结果。
 * 它包含四个主要属性：是否成功、响应消息、异常码和响应数据。
 * </p>
 * <p><strong>功能概述：</strong></p>
 * <ul>
 *     <li>{@code success} - 标记请求是否成功，默认为 true。</li>
 *     <li>{@code message} - 响应消息</li>
 *     <li>{@code errorCode} - 错误码</li>
 *     <li>{@code data} - 请求成功的实际返回数据</li>
 * </ul>
 * @date 2024-12-07
 */

@Data //Lombok中的注解 在类上添加 @Data 注解，Lombok 会自动生成构造方法等
public class Response<T> implements Serializable {

    // 是否成功，默认为 true
    private boolean success = true;
    // 响应消息
    private String message;
    // 异常码
    private String errorCode;
    // 响应数据
    private T data;

    // =================================== 成功响应 ===================================
    public static <T> Response<T> success() {
        Response<T> response = new Response<>();
        return response;
    }

    public static <T> Response<T> success(T data) {
        Response<T> response = new Response<>();
        response.setData(data);
        return response;
    }

    // =================================== 失败响应 ===================================
    public static <T> Response<T> fail() {
        Response<T> response = new Response<>();
        response.setSuccess(false);
        return response;
    }

    public static <T> Response<T> fail(String errorMessage) {
        Response<T> response = new Response<>();
        response.setSuccess(false);
        response.setMessage(errorMessage);
        return response;
    }

    public static <T> Response<T> fail(String errorCode, String errorMessage) {
        Response<T> response = new Response<>();
        response.setSuccess(false);
        response.setErrorCode(errorCode);
        response.setMessage(errorMessage);
        return response;
    }

    public static <T> Response<T> fail(BizException bizException) {
        Response<T> response = new Response<>();
        response.setSuccess(false);
        response.setErrorCode(bizException.getErrorCode());
        response.setMessage(bizException.getErrorMessage());
        return response;
    }

    public static <T> Response<T> fail(BaseExceptionInterface baseExceptionInterface) {
        Response<T> response = new Response<>();
        response.setSuccess(false);
        response.setErrorCode(baseExceptionInterface.getErrorCode());
        response.setMessage(baseExceptionInterface.getErrorMessage());
        return response;
    }


}