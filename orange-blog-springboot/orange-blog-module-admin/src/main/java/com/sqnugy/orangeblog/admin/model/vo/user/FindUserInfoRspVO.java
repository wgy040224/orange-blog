package com.sqnugy.orangeblog.admin.model.vo.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName FindUserInfoRspVO
 * @description
 * @date 2024-12-09
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindUserInfoRspVO {
    /**
     * 用户名
     */
    private String username;

}

