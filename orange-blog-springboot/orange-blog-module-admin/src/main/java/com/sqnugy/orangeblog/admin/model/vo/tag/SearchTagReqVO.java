package com.sqnugy.orangeblog.admin.model.vo.tag;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName SearchTagReqVO
 * @description 标签模糊查询
 * @date 2024-12-09
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "标签模糊查询 VO")
public class SearchTagReqVO {

    @NotBlank(message = "标签查询关键词不能为空")
    private String keys;

}

