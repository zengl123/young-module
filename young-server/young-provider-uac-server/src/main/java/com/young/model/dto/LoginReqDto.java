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
 * @CreateDate:2019/5/15 9:33
 * @UpdateUser:
 * @UpdateDate:2019/5/15 9:33
 * @UpdateRemark:
 * @Version:
 */
@Data
@ApiModel(value = "登录参数")
public class LoginReqDto implements Serializable {
    /**
     * 登录名
     */
    @ApiModelProperty(value = "登录名")
    private String loginName;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String loginPwd;

    /**
     * 登录IP地址
     */
    @ApiModelProperty(value = "ip")
    private String ip;

    /**
     * 登录秘钥
     */
    @ApiModelProperty(value = "登录秘钥")
    private String secToken;

    /**
     * 系统ID
     */
    @ApiModelProperty(value = "系统ID")
    private Long applicationId;
}

