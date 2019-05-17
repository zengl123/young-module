package com.young.controller;

import com.google.common.base.Preconditions;
import com.young.RequestUtil;
import com.young.enums.UacUserTokenStatusEnum;
import com.young.model.dto.UserRegisterDto;
import com.young.model.dto.LoginRespDto;
import com.young.model.dto.UserTokenDto;
import com.young.service.IUacLoginService;
import com.young.service.IUacUserService;
import com.young.service.IUacUserTokenService;
import com.young.support.BaseController;
import com.young.wrapper.WrapMapper;
import com.young.wrapper.Wrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.security.oauth2.common.exceptions.UnapprovedClientAuthenticationException;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/14 16:54
 * @UpdateUser:
 * @UpdateDate:2019/5/14 16:54
 * @UpdateRemark:
 * @Version:
 */
@Slf4j
@RestController
@RequestMapping(value = "", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Api(value = "Web - UacUserLoginController", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UacUserLoginController extends BaseController {
    @Resource
    private IUacUserService uacUserService;
    @Resource
    private IUacLoginService uacLoginService;
    @Resource
    private IUacUserTokenService uacUserTokenService;
    @Resource
    private ClientDetailsService clientDetailsService;
    private static final String BEARER_TOKEN_TYPE = "Basic ";

    /**
     * 登录成功获取菜单信息和用户信息.
     *
     * @param applicationId the application id
     * @return the wrapper
     */
    @PostMapping(value = "/user/loginAfter/{applicationId}")
    @ApiOperation(httpMethod = "POST", value = "登录成功获取用户菜单")
    public Wrapper<LoginRespDto> loginAfter(@PathVariable Long applicationId) {
        log.info("登录成功获取用户菜单. applicationId={}", applicationId);
        LoginRespDto result = uacLoginService.loginAfter(applicationId);
        return WrapMapper.ok(result);
    }

    /**
     * 登出.
     *
     * @param accessToken the access token
     * @return the wrapper
     */
    @PostMapping(value = "/user/logout")
    @ApiOperation(httpMethod = "POST", value = "登出")
    public Wrapper loginAfter(String accessToken) {
        if (!StringUtils.isEmpty(accessToken)) {
            // 修改用户在线状态
            UserTokenDto userTokenDto = uacUserTokenService.getByAccessToken(accessToken);
            userTokenDto.setStatus(UacUserTokenStatusEnum.OFF_LINE.getStatus());
            uacUserTokenService.updateUacUserToken(userTokenDto, getLoginAuthDto());
        }
        return WrapMapper.ok();
    }

    /**
     * 刷新token.
     *
     * @param request      the request
     * @param refreshToken the refresh token
     * @param accessToken  the access token
     * @return the wrapper
     */
    @GetMapping(value = "/auth/user/refreshToken")
    @ApiOperation(httpMethod = "POST", value = "刷新token")
    public Wrapper<String> refreshToken(HttpServletRequest request, @RequestParam(value = "refreshToken") String refreshToken, @RequestParam(value = "accessToken") String accessToken) {
        String token;
        try {
            Preconditions.checkArgument(StringUtils.isNotEmpty(accessToken), "accessToken is null");
            Preconditions.checkArgument(StringUtils.isNotEmpty(refreshToken), "refreshToken is null");
            String header = request.getHeader(HttpHeaders.AUTHORIZATION);
            if (header == null || !header.startsWith(BEARER_TOKEN_TYPE)) {
                throw new UnapprovedClientAuthenticationException("请求头中无client信息");
            }
            String[] tokens = RequestUtil.extractAndDecodeHeader(header);
            assert tokens.length == 2;
            String clientId = tokens[0];
            String clientSecret = tokens[1];
            ClientDetails clientDetails = clientDetailsService.loadClientByClientId(clientId);
            if (clientDetails == null) {
                throw new UnapprovedClientAuthenticationException("clientId对应的配置信息不存在:" + clientId);
            } else if (!StringUtils.equals(clientDetails.getClientSecret(), clientSecret)) {
                throw new UnapprovedClientAuthenticationException("clientSecret不匹配:" + clientId);
            }
            token = uacUserTokenService.refreshToken(accessToken, refreshToken, request);
        } catch (Exception e) {
            log.error("refreshToken={}", e.getMessage(), e);
            return WrapMapper.error();
        }
        return WrapMapper.ok(token);
    }

    /**
     * 注册
     *
     * @param registerDto the registry dto
     * @return the wrapper
     */
    @PostMapping(value = "/registerUser")
    @ApiOperation(httpMethod = "POST", value = "注册新用户")
    public Wrapper registerUser(@ApiParam(name = "registerDto", value = "用户注册Dto") @RequestBody UserRegisterDto registerDto) {
        log.info("vue注册开始-注册参数：{}", registerDto);
        uacUserService.register(registerDto);
        return WrapMapper.ok("注册成功");
    }
}
