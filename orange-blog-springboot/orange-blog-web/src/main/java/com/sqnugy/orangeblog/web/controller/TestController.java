package com.sqnugy.orangeblog.web.controller;

import com.sqnugy.orangeblog.common.aspect.ApiOperationLog;
import com.sqnugy.orangeblog.common.enums.ResponseCodeEnum;
import com.sqnugy.orangeblog.common.exception.BizException;
import com.sqnugy.orangeblog.common.utils.Response;
import com.sqnugy.orangeblog.web.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName TestController
 * @description
 * @date 2024-12-07
 */

@RestController //RestController = ResponseBody + Controller | ResponseBody用于指示一个方法的返回值应该直接写入 HTTP 响应体中，而不是解析为视图名称。
@Slf4j
public class TestController {

    @PostMapping("/test")
    @ApiOperationLog(description = "测试接口")
    public Response test(@RequestBody @Validated User user, BindingResult bindingResult) {
        // 主动定义一个运行时异常，分母不能为零
        int i = 1 / 0;
        return Response.success();
    }



}
