package com.young.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 9:51
 * @UpdateUser:
 * @UpdateDate:2019/5/15 9:51
 * @UpdateRemark:
 * @Version:
 */
@Data
@ApiModel(value = "绑定的用户信息")
public class BindRoleDto implements Serializable {
    /**
     * 用户ID
     */
    @ApiModelProperty(value = "用户ID")
    private Long roleId;
    /**
     * 手机号
     */
    @ApiModelProperty(value = "角色编码")
    private String roleCode;
    /**
     * 用户名
     */
    @ApiModelProperty(value = "角色名称")
    private String roleName;
    /**
     * 是否可以操作
     */
    @ApiModelProperty(value = "是否可以操作")
    private boolean disabled;
}
