package com.young.service.impl;

import com.google.common.base.Preconditions;
import com.young.PublicUtil;
import com.young.constant.UacConstant;
import com.young.enums.ErrorCodeEnum;
import com.young.exception.UacBizException;
import com.young.model.domain.UacUser;
import com.young.model.dto.LoginAuthDto;
import com.young.model.dto.LoginRespDto;
import com.young.model.vo.MenuVo;
import com.young.service.IUacLoginService;
import com.young.service.IUacMenuService;
import com.young.service.IUacUserService;
import com.young.utils.SecurityUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 10:18
 * @UpdateUser:
 * @UpdateDate:2019/5/15 10:18
 * @UpdateRemark:
 * @Version:
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class UacLoginServiceImpl implements IUacLoginService {

    @Resource
    private IUacUserService uacUserService;
    @Resource
    private IUacMenuService uacMenuService;

    @Override
    public LoginRespDto loginAfter(Long applicationId) {
        LoginRespDto loginRespDto = new LoginRespDto();
        String loginName = SecurityUtil.getCurrentLoginName();
        if (StringUtils.isEmpty(loginName)) {
            log.error("操作超时, 请重新登录 loginName={}", loginName);
            Preconditions.checkArgument(StringUtils.isNotEmpty(loginName), "操作超时, 请重新登录");
        }
        UacUser uacUser = uacUserService.findByLoginName(loginName);
        if (PublicUtil.isEmpty(uacUser)) {
            log.info("找不到用户信息 loginName={}", loginName);
            throw new UacBizException(ErrorCodeEnum.UAC10011002, loginName);
        }
        LoginAuthDto loginAuthDto = this.getLoginAuthDto(uacUser);
        List<MenuVo> menuVoList = uacMenuService.getMenuVoList(uacUser.getId(), applicationId);
        if (PublicUtil.isNotEmpty(menuVoList) && UacConstant.MENU_ROOT.equals(menuVoList.get(0).getMenuCode())) {
            menuVoList = menuVoList.get(0).getSubMenu();
        }
        loginRespDto.setLoginAuthDto(loginAuthDto);
        loginRespDto.setMenuList(menuVoList);
        return loginRespDto;
    }

    private LoginAuthDto getLoginAuthDto(UacUser uacUser) {
        LoginAuthDto loginAuthDto = new LoginAuthDto();
        loginAuthDto.setUserId(uacUser.getId());
        loginAuthDto.setUserName(uacUser.getUserName());
        loginAuthDto.setLoginName(uacUser.getLoginName());
        return loginAuthDto;
    }


}
