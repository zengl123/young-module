package com.young.model.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 9:40
 * @UpdateUser:
 * @UpdateDate:2019/5/15 9:40
 * @UpdateRemark:
 * @Version:
 */
@Data
public class UserMenuDto implements Serializable {
    /**
     * 一级菜单名称
     */
    private String fistMenuName;
    /**
     * 一级菜单图标
     */
    private String fistMenuIcon;
    /**
     * 一级菜单Id
     */
    private String fistMenuId;
    /**
     * 所有的子节点
     */
    private List<UserMenuChildrenDto> children;
}
