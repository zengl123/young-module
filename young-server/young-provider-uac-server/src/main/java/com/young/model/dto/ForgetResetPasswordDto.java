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
 * @CreateDate:2019/5/15 9:46
 * @UpdateUser:
 * @UpdateDate:2019/5/15 9:46
 * @UpdateRemark:
 * @Version:
 */
@Data
@ApiModel(value = "用户忘记密码Dto")
public class ForgetResetPasswordDto implements Serializable {
    private static final long serialVersionUID = 5478700873789068921L;
    @ApiModelProperty(value = "登录名")
    private String loginName;
    @ApiModelProperty(value = "密码")
    private String loginPwd;
    @ApiModelProperty(value = "邮箱")
    private String email;
    @ApiModelProperty(value = "验证码")
    private String emailCode;
    @ApiModelProperty(value = "token")
    private String forgetToken;
}
