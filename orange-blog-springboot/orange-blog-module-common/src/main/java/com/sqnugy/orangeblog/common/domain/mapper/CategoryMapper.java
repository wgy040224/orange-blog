package com.sqnugy.orangeblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sqnugy.orangeblog.common.domain.dos.CategoryDO;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName CategoryMapper
 * @description
 * @date 2024-12-09
 */

public interface CategoryMapper extends BaseMapper<CategoryDO> {

    /**
     * 根据用户名查询
     * @param categoryName
     * @return
     */
    default CategoryDO selectByName(String categoryName) {
        // 构建查询条件
        LambdaQueryWrapper<CategoryDO> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(CategoryDO::getName, categoryName);

        // 执行查询
        return selectOne(wrapper);
    }
}

