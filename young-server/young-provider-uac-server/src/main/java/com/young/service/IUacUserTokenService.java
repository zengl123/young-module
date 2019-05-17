package com.young.service;

import com.arronlong.httpclientutil.exception.HttpProcessException;
import com.github.pagehelper.PageInfo;
import com.young.model.domain.UacUserToken;
import com.young.model.dto.LoginAuthDto;
import com.young.model.dto.TokenMainQueryDto;
import com.young.model.dto.UserTokenDto;
import com.young.support.IService;

import javax.servlet.http.HttpServletRequest;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/14 17:29
 * @UpdateUser:
 * @UpdateDate:2019/5/14 17:29
 * @UpdateRemark:
 * @Version:
 */
public interface IUacUserTokenService extends IService<UacUserToken> {
    /**
     * 保存token.
     *
     * @param accessToken  the access token
     * @param refreshToken the refresh token
     * @param loginAuthDto the login auth dto
     * @param request      the request
     */
    void saveUserToken(String accessToken, String refreshToken, LoginAuthDto loginAuthDto, HttpServletRequest request);

    /**
     * 获取token.
     *
     * @param accessToken the access token
     * @return the by access token
     */
    UserTokenDto getByAccessToken(String accessToken);


    /**
     * 更新token.
     *
     * @param tokenDto     the token dto
     * @param loginAuthDto the login auth dto
     */
    void updateUacUserToken(UserTokenDto tokenDto, LoginAuthDto loginAuthDto);

    /**
     * 分页查询token列表.
     *
     * @param token the token
     * @return the page info
     */
    PageInfo listTokenWithPage(TokenMainQueryDto token);

    /**
     * 刷新token.
     *
     * @param accessToken  the access token
     * @param refreshToken the refresh token
     * @param request      the request
     * @return  s string
     * @throws HttpProcessException the http process exception
     */
    String refreshToken(String accessToken, String refreshToken, HttpServletRequest request) throws HttpProcessException;

    /**
     * 更新token离线状态.
     *
     * @return the int
     */
    int batchUpdateTokenOffLine();
}
