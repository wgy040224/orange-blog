package com.sqnugy.orangeblog.web.controller;

import com.sqnugy.orangeblog.common.aspect.ApiOperationLog;
import com.sqnugy.orangeblog.common.utils.Response;
import com.sqnugy.orangeblog.web.service.StatisticsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName StatisticsController
 * @description
 * @date 2024-12-13
 */

@RestController
@RequestMapping("/statistics")
@Api(tags = "统计信息")
public class StatisticsController {

    @Autowired
    private StatisticsService statisticsService;

    @PostMapping("/info")
    @ApiOperation(value = "前台获取统计信息")
    @ApiOperationLog(description = "前台获取统计信息")
    public Response findInfo() {
        return statisticsService.findInfo();
    }

}
