package com.sqnugy.orangeblog.admin.service;

import com.sqnugy.orangeblog.admin.model.vo.category.FindCategoryPageListReqVO;
import com.sqnugy.orangeblog.admin.model.vo.category.AddCategoryReqVO;
import com.sqnugy.orangeblog.admin.model.vo.category.DeleteCategoryReqVO;
import com.sqnugy.orangeblog.common.utils.PageResponse;
import com.sqnugy.orangeblog.common.utils.Response;

/**
 * @author sqnugy
 * @version 1.0
 * @InterfaceName AdminCategoryService
 * @description
 * @date 2024-12-09
 */

public interface AdminCategoryService {
    /**
     * 添加分类
     * @param addCategoryReqVO
     * @return
     */
    Response addCategory(AddCategoryReqVO addCategoryReqVO);

    /**
     * 分类分页数据查询
     * @param findCategoryPageListReqVO
     * @return
     */
    PageResponse findCategoryPageList(FindCategoryPageListReqVO findCategoryPageListReqVO);

    /**
     * 删除分类
     * @param deleteCategoryReqVO
     * @return
     */
    Response deleteCategory(DeleteCategoryReqVO deleteCategoryReqVO);

    /**
     * 获取文章分类的 Select 列表数据
     * @return
     */
    Response findCategorySelectList();

}

