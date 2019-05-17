package com.young.model.domain;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/17 12:46
 * @UpdateUser:
 * @UpdateDate:2019/5/17 12:46
 * @UpdateRemark:
 * @Version:
 */
@Data
@Table(name = "pc_uac_role_menu")
@Alias(value = "uacRoleMenu")
public class UacRoleMenu implements Serializable {
    @Id
    @Column(name = "role_id")
    private Long roleId;

    @Id
    @Column(name = "menu_id")
    private Long menuId;
}