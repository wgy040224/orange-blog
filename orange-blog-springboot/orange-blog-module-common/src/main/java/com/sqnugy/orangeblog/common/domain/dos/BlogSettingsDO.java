package com.sqnugy.orangeblog.common.domain.dos;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName BlogSettingsDO
 * @description
 * @date 2024-12-11
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("t_blog_settings")
public class BlogSettingsDO {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String logo;

    private String name;

    private String author;

    private String introduction;

    private String avatar;

    private String githubHomepage;

    private String csdnHomepage;

    private String giteeHomepage;

    private String zhihuHomepage;
}
