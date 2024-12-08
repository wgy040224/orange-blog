package com.sqnugy.orangeblog.jwt.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName LoginRspVO
 * @description LoginRspVO 是一个用于表示登录响应的数据传输对象（DTO）。
 * @date 2024-12-08
 */


@Data // Lombok 注解，自动生成 getter 和 setter 方法，以及 toString(), equals(), 和 hashCode() 方法。
@Builder // Lombok 注解，提供了一个流畅的构建器 API 来创建对象实例。
@NoArgsConstructor // Lombok 注解，自动生成无参构造函数。
@AllArgsConstructor // Lombok 注解，自动生成包含所有字段的全参构造函数。
public class LoginRspVO {

    /**
     * token: 登录成功后生成的 JWT (JSON Web Token) 字符串。
     */
    private String token;

}