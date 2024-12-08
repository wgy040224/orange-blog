package com.sqnugy.orangeblog.jwt.handler;

import com.sqnugy.orangeblog.common.enums.ResponseCodeEnum;
import com.sqnugy.orangeblog.common.utils.Response;
import com.sqnugy.orangeblog.jwt.exception.UsernameOrPasswordNullException;
import com.sqnugy.orangeblog.jwt.utils.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName RestAuthenticationFailureHandler
 * @description RestAuthenticationFailureHandler 是一个处理认证失败事件的处理器。
 * @date 2024-12-08
 */

@Component
@Slf4j
public class RestAuthenticationFailureHandler implements AuthenticationFailureHandler {

    /**
     * 当用户认证失败时调用的方法。
     */
    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        log.warn("AuthenticationException: ", exception);
        if (exception instanceof UsernameOrPasswordNullException) {
            // 用户名或密码为空
            ResultUtil.fail(response, Response.fail(exception.getMessage()));
            return;
        } else if (exception instanceof BadCredentialsException) {
            // 用户名或密码错误
            ResultUtil.fail(response, Response.fail(ResponseCodeEnum.USERNAME_OR_PWD_ERROR));
            return;
        }

        // 登录失败
        ResultUtil.fail(response, Response.fail(ResponseCodeEnum.LOGIN_FAIL));
    }
}

