package com.sqnugy.orangeblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sqnugy.orangeblog.common.domain.dos.TagDO;

import javax.swing.text.html.HTML;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName TagMapper
 * @description TODO
 * @date 2024-12-09
 */

public interface TagMapper extends BaseMapper<TagDO> {

    /**
     * 查询分类标签数据
     * @return
     */
    default Page<TagDO> selectPageList(long current, long size, String name, LocalDate startDate, LocalDate endDate) {
        //分页对象
        Page<TagDO> page = new Page<>(current, size);
        //构造查询条件
        LambdaQueryWrapper<TagDO> wrapper = new LambdaQueryWrapper<>();
        wrapper
                .like(Objects.nonNull(name), TagDO::getName, name)
                .ge(Objects.nonNull(startDate), TagDO::getCreateTime, startDate)
                .le(Objects.nonNull(endDate), TagDO::getCreateTime, endDate)
                .orderByDesc(TagDO::getCreateTime); //order by create_time desc

        return selectPage(page, wrapper);
    }

    /**
     * 根据标签模糊查询
     * @param key
     * @return
     */
    default List<TagDO> selectByKey(String key) {
        LambdaQueryWrapper<TagDO> wrapper = new LambdaQueryWrapper<>();

        //构造模糊查询的条件
        wrapper.like(TagDO::getName, key).orderByDesc(TagDO::getCreateTime);

        return selectList(wrapper);
    }

}

