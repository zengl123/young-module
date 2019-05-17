package com.young.model.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.ibatis.type.Alias;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/14 17:49
 * @UpdateUser:
 * @UpdateDate:2019/5/14 17:49
 * @UpdateRemark:
 * @Version:
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Alias(value = "uacUserToken")
@Table(name = "pc_uac_user_token")
public class UacUserToken extends BaseEntity {
    /**
     * 父ID
     */
    private Long pid;

    /**
     * 登录名
     */
    @Column(name = "login_name")
    private String loginName;

    /**
     * 姓名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 登陆人Ip地址
     */
    @Column(name = "login_ip")
    private String loginIp;

    /**
     * 登录地址
     */
    @Column(name = "login_location")
    private String loginLocation;

    /**
     * 登录地址
     */
    @Column(name = "login_time")
    private Date loginTime;

    /**
     * 操作系统
     */
    private String os;

    /**
     * 浏览器类型
     */
    private String browser;

    /**
     * 访问token
     */
    @Column(name = "access_token")
    private String accessToken;

    /**
     * 刷新token
     */
    @Column(name = "refresh_token")
    private String refreshToken;

    /**
     * 访问token的生效时间(秒)
     */
    @Column(name = "access_token_validity")
    private Integer accessTokenValidity;

    /**
     * 刷新token的生效时间(秒)
     */
    @Column(name = "refresh_token_validity")
    private Integer refreshTokenValidity;

    /**
     * 0 在线 10已刷新 20 离线
     */
    private Integer status;

    /**
     * 组织流水号
     */
    @Column(name = "group_id")
    private Long groupId;

    /**
     * 组织名称
     */
    @Column(name = "group_name")
    private String groupName;

    /**
     * 失效时间(秒)
     */
    @Transient
    private Integer expiresIn;
}