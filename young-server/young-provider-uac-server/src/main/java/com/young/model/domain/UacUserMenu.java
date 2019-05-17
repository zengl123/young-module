package com.young.model.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 13:45
 * @UpdateUser:
 * @UpdateDate:2019/5/15 13:45
 * @UpdateRemark:
 * @Version:
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UacUserMenu extends BaseEntity {
    /**
     * pc_uac_user_menu.user_id;用户id
     */
    private Long userId;

    /**
     * pc_uac_user_menu.menu_id;菜单id
     */
    private Long menuId;

    /**
     * pc_uac_user_menu.number;序号
     */
    private Integer number;
}