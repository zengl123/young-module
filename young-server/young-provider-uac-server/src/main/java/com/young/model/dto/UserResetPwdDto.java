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
 * @CreateDate:2019/5/15 9:45
 * @UpdateUser:
 * @UpdateDate:2019/5/15 9:45
 * @UpdateRemark:
 * @Version:
 */
@Data
@ApiModel(value = "用户重置密码Dto")
public class UserResetPwdDto implements Serializable {
    /**
     * 手机号
     */
    @ApiModelProperty(value = "手机号")
    private String mobileNo;

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

    /**
     * 短信验证码
     */
    @ApiModelProperty(value = "短信验证码")
    private String smsCode;
}
