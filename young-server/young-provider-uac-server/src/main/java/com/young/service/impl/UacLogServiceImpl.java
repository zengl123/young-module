package com.young.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.young.PublicUtil;
import com.young.mapper.UacLogMapper;
import com.young.model.domain.UacAction;
import com.young.model.domain.UacLog;
import com.young.model.dto.LoginAuthDto;
import com.young.model.dto.OperationLogDto;
import com.young.model.dto.UacLogMainDto;
import com.young.service.IOpcRpcService;
import com.young.service.IUacActionService;
import com.young.service.IUacLogService;
import com.young.support.BaseService;
import org.modelmapper.ModelMapper;
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
 * @CreateDate:2019/5/17 13:53
 * @UpdateUser:
 * @UpdateDate:2019/5/17 13:53
 * @UpdateRemark:
 * @Version:
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UacLogServiceImpl extends BaseService<UacLog> implements IUacLogService {
    @Resource
    private UacLogMapper uacLogMapper;
    @Resource
    private IOpcRpcService opcRpcService;
    @Resource
    private IUacActionService uacActionService;

    @Override
    public int saveLog(UacLog uacLog, LoginAuthDto loginAuthDto) {
        // 根据uri 查询url对应的权限
        UacAction uacAction = uacActionService.matchesByUrl(uacLog.getRequestUrl());
        if (uacAction != null) {
            uacLog.setActionId(uacAction.getId());
            uacLog.setActionCode(uacAction.getActionCode());
            uacLog.setActionName(uacAction.getActionName());
        }
        uacLog.setUpdateInfo(loginAuthDto);
        uacLog.setId(this.generateId());
        return uacLogMapper.insertSelective(uacLog);
    }

    @Override
    @Transactional(readOnly = true, rollbackFor = Exception.class)
    public List<UacLog> selectUserLogListByUserId(Long userId) {
        return uacLogMapper.selectUserLogListByUserId(userId);
    }

    @Override
    public Integer saveOperationLog(OperationLogDto operationLogDto) {
        // 根据uri 查询url对应的权限
        UacAction uacAction = uacActionService.matchesByUrl(operationLogDto.getRequestUrl());
        if (uacAction != null) {
            operationLogDto.setActionCode(uacAction.getActionCode());
            operationLogDto.setActionName(uacAction.getActionName());
            operationLogDto.setActionId(uacAction.getId());
        }
        ModelMapper modelMapper = new ModelMapper();
        UacLog uacLog = modelMapper.map(operationLogDto, UacLog.class);
        uacLog.setId(generateId());
        // 获取操作位置
        String locationById = opcRpcService.getLocationById(operationLogDto.getIp());
        uacLog.setLocation(locationById);
        return uacLogMapper.insertSelective(uacLog);
    }

    @Override
    public PageInfo queryLogListWithPage(UacLogMainDto uacLogQueryDtoPage) {
        List<Long> menuIdList = uacLogQueryDtoPage.getMenuIdList();
        Long actionId = null;
        if (PublicUtil.isNotEmpty(menuIdList)) {
            actionId = menuIdList.get(menuIdList.size() - 1);
        }
        uacLogQueryDtoPage.setMenuId(actionId);
        PageHelper.startPage(uacLogQueryDtoPage.getPageNum(), uacLogQueryDtoPage.getPageSize());
        List<UacLog> actionList = uacLogMapper.queryLogListWithPage(uacLogQueryDtoPage);
        return new PageInfo<>(actionList);
    }
}

