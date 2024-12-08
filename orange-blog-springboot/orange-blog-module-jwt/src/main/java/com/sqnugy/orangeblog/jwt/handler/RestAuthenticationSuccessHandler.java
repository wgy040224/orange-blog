package com.sqnugy.orangeblog.jwt.handler;

import com.sqnugy.orangeblog.common.utils.Response;
import com.sqnugy.orangeblog.jwt.model.LoginRspVO;
import com.sqnugy.orangeblog.jwt.utils.JwtTokenHelper;
import com.sqnugy.orangeblog.jwt.utils.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName RestAuthenticationSuccessHandler
 * @description RestAuthenticationSuccessHandler 是一个处理认证成功事件的处理器。
 * @date 2024-12-08
 */

@Component // 标记此类为一个 Spring 组件，使其能够被自动检测和注册到 Spring 应用上下文中。
@Slf4j // Lombok 注解，用于简化日志记录配置，自动创建一个名为 log 的静态日志记录器字段。
public class RestAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    /**
     * JwtTokenHelper 用于生成和解析 JWT Token。
     */
    @Autowired
    private JwtTokenHelper jwtTokenHelper;

    /**
     * 当用户成功认证时调用的方法。
     */
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        // 从 authentication 对象中获取用户的 UserDetails 实例，这里是获取用户的用户名
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();

        // 通过用户名生成 Token
        String username = userDetails.getUsername();
        String token = jwtTokenHelper.generateToken(username);

        // 返回 Token
        LoginRspVO loginRspVO = LoginRspVO.builder().token(token).build();

        ResultUtil.ok(response, Response.success(loginRspVO));
    }
}
