package com.sqnugy.orangeblog.common.enums;

import com.sqnugy.orangeblog.common.exception.BaseExceptionInterface;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Lombok;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName ResponseCodeEnum
 * @description 响应异常码
 * @date 2024-12-07
 */

@Getter //Lombok中的注解，用于生成get方法
@AllArgsConstructor //Lombok 库提供的一个注解，用于自动生成一个全参数构造函数
public enum ResponseCodeEnum implements BaseExceptionInterface {

    // ----------- 通用异常状态码 -----------
    SYSTEM_ERROR("10000", "出错啦，后台小哥正在努力修复中..."),

    PARAM_NOT_VALID("10001", "参数错误"),

    // ----------- 业务异常状态码 -----------
    PRODUCT_NOT_FOUND("20000", "该产品不存在（测试使用）"),
    ;

    // 异常码
    private String errorCode;
    // 错误信息
    private String errorMessage;

}
