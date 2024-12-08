package com.sqnugy.orangeblog.jwt.filter;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sqnugy.orangeblog.jwt.exception.UsernameOrPasswordNullException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName JwtAuthenticationFilter
 * @description JwtAuthenticationFilter 是一个自定义的身份验证过滤器，用于处理基于 JSON Web Token (JWT) 的用户登录请求。
 * @date 2024-12-08
 */

public class JwtAuthenticationFilter extends AbstractAuthenticationProcessingFilter {


    /**
     * 指定用户登录的访问地址
     */
    public JwtAuthenticationFilter() {
        super(new AntPathRequestMatcher("/login", "POST"));
    }

    /**
    * 尝试进行身份验证的方法。此方法会在接收到匹配的登录请求时被调用。
    * 它解析客户端发送的 JSON 数据以提取用户名和密码，
    * 然后使用 UsernamePasswordAuthenticationToken 包装这些信息并尝试进行认证。
    */
    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException, IOException, ServletException {
        ObjectMapper mapper = new ObjectMapper();
        // 解析提交的 JSON 数据
        JsonNode jsonNode = mapper.readTree(request.getInputStream());
        JsonNode usernameNode = jsonNode.get("username");
        JsonNode passwordNode =  jsonNode.get("password");

        // 判断用户名、密码是否为空
        if (Objects.isNull(usernameNode) || Objects.isNull(passwordNode)
                || StringUtils.isBlank(usernameNode.textValue()) || StringUtils.isBlank(passwordNode.textValue())) {
            throw new UsernameOrPasswordNullException("用户名或密码不能为空");
        }

        String username = usernameNode.textValue();
        String password = passwordNode.textValue();

        // 将用户名、密码封装到 Token 中
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken
                = new UsernamePasswordAuthenticationToken(username, password);
        return getAuthenticationManager().authenticate(usernamePasswordAuthenticationToken);
    }
}

