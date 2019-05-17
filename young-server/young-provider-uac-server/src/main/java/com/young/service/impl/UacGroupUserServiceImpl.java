package com.young.service.impl;

import com.young.mapper.UacGroupUserMapper;
import com.young.model.domain.UacGroup;
import com.young.model.domain.UacGroupUser;
import com.young.service.IUacGroupUserService;
import com.young.support.BaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/17 13:54
 * @UpdateUser:
 * @UpdateDate:2019/5/17 13:54
 * @UpdateRemark:
 * @Version:
 */
@Service
public class UacGroupUserServiceImpl extends BaseService<UacGroupUser> implements IUacGroupUserService {
    @Resource
    private UacGroupUserMapper uacGroupUserMapper;

    @Override
    public UacGroupUser queryByUserId(Long userId) {
        return uacGroupUserMapper.getByUserId(userId);
    }

    @Override
    public int updateByUserId(UacGroupUser uacGroupUser) {
        return uacGroupUserMapper.updateByUserId(uacGroupUser);
    }

    @Override
    public List<UacGroup> getGroupListByUserId(Long userId) {
        return uacGroupUserMapper.selectGroupListByUserId(userId);
    }

    @Override
    public void saveUserGroup(Long userId, Long groupId) {
        UacGroupUser groupUser = new UacGroupUser();
        groupUser.setUserId(userId);
        groupUser.setGroupId(groupId);
        uacGroupUserMapper.insertSelective(groupUser);
    }
}

