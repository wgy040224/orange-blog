package com.sqnugy.orangeblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.sqnugy.orangeblog.common.domain.dos.StatisticsArticlePVDO;

import java.time.LocalDate;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName StatisticsArticlePVMapper
 * @description
 * @date 2024-12-13
 */

public interface StatisticsArticlePVMapper extends BaseMapper<StatisticsArticlePVDO> {

    /**
     * 对指定日期的文章 PV 访问量进行 +1
     * @param date
     * @return
     */
    default int increasePVCount(LocalDate date) {
        return update(null, Wrappers.<StatisticsArticlePVDO>lambdaUpdate()
                .setSql("pv_count = pv_count + 1")
                .eq(StatisticsArticlePVDO::getPvDate, date));
    }

}
