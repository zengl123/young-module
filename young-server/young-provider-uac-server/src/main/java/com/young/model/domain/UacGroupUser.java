package com.young.model.domain;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 12:52
 * @UpdateUser:
 * @UpdateDate:2019/5/15 12:52
 * @UpdateRemark:
 * @Version:
 */
@Data
@Table(name = "pc_uac_group_user")
@Alias(value = "uacGroupUser")
public class UacGroupUser implements Serializable {
    /**
     * 角色ID
     */
    @Column(name = "group_id")
    private Long groupId;

    /**
     * 菜单ID
     */
    @Column(name = "user_id")
    private Long userId;
}
