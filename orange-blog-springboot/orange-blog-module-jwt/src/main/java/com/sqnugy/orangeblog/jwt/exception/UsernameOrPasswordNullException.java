package com.sqnugy.orangeblog.jwt.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName UsernameOrPasswordNullException
 * @description UsernameOrPasswordNullException 是一个自定义异常类，用于表示在认证过程中遇到用户名或密码为空的情况。
 * @date 2024-12-08
 */

public class UsernameOrPasswordNullException extends AuthenticationException {

    /**
     * 构造一个新的 UsernameOrPasswordNullException 异常，带有指定的详细消息和原因。
     */
    public UsernameOrPasswordNullException(String msg, Throwable cause) {
        super(msg, cause);
    }


    /**
     * 构造一个新的 UsernameOrPasswordNullException 异常，仅带有指定的详细消息。
     */
    public UsernameOrPasswordNullException(String msg) {
        super(msg);
    }
}
