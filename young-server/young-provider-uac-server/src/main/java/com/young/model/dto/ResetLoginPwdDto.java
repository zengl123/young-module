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
 * @CreateDate:2019/5/15 9:49
 * @UpdateUser:
 * @UpdateDate:2019/5/15 9:49
 * @UpdateRemark:
 * @Version:
 */
@Data
@ApiModel
public class ResetLoginPwdDto implements Serializable {
    /**
     * 新密码
     */
    @ApiModelProperty(value = "密钥")
    private String resetPwdKey;
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

