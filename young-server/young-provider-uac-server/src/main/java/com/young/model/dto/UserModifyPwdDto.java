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
 * @CreateDate:2019/5/15 9:44
 * @UpdateUser:
 * @UpdateDate:2019/5/15 9:44
 * @UpdateRemark:
 * @Version:
 */
@Data
@ApiModel(value = "用户修改密码Dto")
public class UserModifyPwdDto implements Serializable {
    /**
     * 登录名
     */
    @ApiModelProperty(value = "登录名")
    private String loginName;

    /**
     * 原始密码
     */
    @ApiModelProperty(value = "原始密码")
    private String oldPassword;

    /**
     * 新密码
     */
    @ApiModelProperty(value = "新密码")
    private String newPassword;

    /**
     * 确认密码
     */
    @ApiModelProperty(value = "确认密码")
    private String confirmPwd;
}

