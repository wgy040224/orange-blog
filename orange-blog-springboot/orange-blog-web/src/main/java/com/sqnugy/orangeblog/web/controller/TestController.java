package com.sqnugy.orangeblog.web.controller;

import com.sqnugy.orangeblog.common.aspect.ApiOperationLog;
import com.sqnugy.orangeblog.web.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
    public User test(@RequestBody User user) {
        // 返参
        return user;
    }

}
