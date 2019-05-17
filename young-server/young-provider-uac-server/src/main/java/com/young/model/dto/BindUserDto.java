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
 * @CreateDate:2019/5/15 13:03
 * @UpdateUser:
 * @UpdateDate:2019/5/15 13:03
 * @UpdateRemark:
 * @Version:
 */
@Data
@ApiModel(value = "绑定的用户信息")
public class BindUserDto implements Serializable {
    /**
     * 用户ID
     */
    @ApiModelProperty(value = "用户ID")
    private Long userId;
    /**
     * 手机号
     */
    @ApiModelProperty(value = "手机号")
    private String mobileNo;
    /**
     * 用户名
     */
    @ApiModelProperty(value = "用户名")
    private String userName;
    /**
     * 是否可以操作
     */
    @ApiModelProperty(value = "是否可以操作")
    private boolean disabled;
}
