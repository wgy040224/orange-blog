package com.sqnugy.orangeblog.common.config;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName InsertBatchMapper
 * @description
 * @date 2024-12-12
 */

public interface InsertBatchMapper<T> extends BaseMapper<T> {

    // 批量插入
    int insertBatchSomeColumn(@Param("list") List<T> batchList);

}

