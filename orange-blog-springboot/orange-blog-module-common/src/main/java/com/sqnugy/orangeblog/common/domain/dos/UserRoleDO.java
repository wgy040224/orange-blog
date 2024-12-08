package com.sqnugy.orangeblog.common.domain.dos;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName UserRoleDO
 * @description 用户角色数据对象 (Data Object)，用于表示用户与角色之间的关联关系。
 * <p>
 * 该实体映射到数据库表 `t_user_role`，其中包含用户的用户名以及他们所拥有的角色信息。
 * </p>
 * @date 2024-12-08
 */

@Data // Lombok 注解，自动生成 getter 和 setter 方法
@Builder // Lombok 注解，提供一个流利的 API 来构建实例
@NoArgsConstructor // Lombok 注解，生成无参构造函数
@AllArgsConstructor // Lombok 注解，生成全参构造函数
@TableName("t_user_role") // MyBatis-Plus 注解，指定该实体对应的数据库表名
public class UserRoleDO {

    /**
     * 主键 ID，自动增长。
     */
    @TableId(type = IdType.AUTO) // MyBatis-Plus 注解，标识这是主键，并且类型为自动递增
    private Long id;

    /**
     * 用户名，用于关联用户。
     */
    private String username;

    /**
     * 角色名称，描述用户的角色。
     */
    private String role;

    /**
     * 创建时间，记录此条目被创建的时间戳。
     */
    private Date createTime;
}

