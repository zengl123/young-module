package com.young.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 13:37
 * @UpdateUser:
 * @UpdateDate:2019/5/15 13:37
 * @UpdateRemark:
 * @Version:
 */
@Data
@ApiModel
public class RoleBindMenuDto implements Serializable {
    /**
     * 菜单权限
     */
    @ApiModelProperty(value = "菜单权限")
    private Set<Long> menuIdList;
    /**
     * 角色Id
     */
    @ApiModelProperty(value = "角色Id")
    private Long roleId;
}
