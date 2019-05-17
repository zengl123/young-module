package com.young.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:用户注册Dto
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/11 10:46
 * @UpdateUser:
 * @UpdateDate:2019/5/11 10:46
 * @UpdateRemark:
 * @Version:
 */
@Data
@ApiModel(value = "用户注册Dto")
public class UserRegisterDto implements Serializable {
    /**
     * 用户名
     */
    @ApiModelProperty(value = "登录名")
    private String loginName;
    /**
     * 手机号
     */
    @ApiModelProperty(value = "手机号")
    private String mobileNo;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String loginPwd;

    /**
     * 确认密码
     */
    @ApiModelProperty(value = "确认密码")
    private String confirmPwd;

    /**
     * 邮箱
     */
    @ApiModelProperty(value = "邮箱")
    private String email;

    /**
     * 注册token
     */
    @ApiModelProperty(value = "注册渠道")
    private String registerSource;
}
