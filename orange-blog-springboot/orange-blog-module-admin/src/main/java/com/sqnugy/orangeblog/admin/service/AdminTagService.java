package com.sqnugy.orangeblog.admin.service;

import com.sqnugy.orangeblog.admin.model.vo.tag.AddTagReqVO;
import com.sqnugy.orangeblog.admin.model.vo.tag.DeleteTagReqVO;
import com.sqnugy.orangeblog.admin.model.vo.tag.FindTagPageListReqVO;
import com.sqnugy.orangeblog.admin.model.vo.tag.SearchTagReqVO;
import com.sqnugy.orangeblog.common.utils.PageResponse;
import com.sqnugy.orangeblog.common.utils.Response;

/**
 * @author sqnugy
 * @version 1.0
 * @InterfaceName AdminTagService
 * @description
 * @date 2024-12-09
 */

public interface AdminTagService {

    /**
     * 添加标签集合
     *
     * @param addTagReqVO
     * @return
     */
    Response addTags(AddTagReqVO addTagReqVO);

    /**
     * 查询标签分页
     *
     * @param findTagPageListReqVO
     * @return
     */
    PageResponse findTagPageList(FindTagPageListReqVO findTagPageListReqVO);


    /**
     * 删除标签
     * @param deleteTagReqVO
     * @return
     */
    Response deleteTag(DeleteTagReqVO deleteTagReqVO);


    /**
     * 根据标签关键词模糊查询
     * @param searchTagReqVO
     * @return
     */
    Response searchTag(SearchTagReqVO searchTagReqVO);
}

