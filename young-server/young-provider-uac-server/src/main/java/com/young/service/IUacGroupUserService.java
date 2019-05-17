package com.young.service;

import com.young.model.domain.UacGroup;
import com.young.model.domain.UacGroupUser;
import com.young.support.IService;

import java.util.List;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 12:53
 * @UpdateUser:
 * @UpdateDate:2019/5/15 12:53
 * @UpdateRemark:
 * @Version:
 */
public interface IUacGroupUserService extends IService<UacGroupUser> {
    /**
     * 根据userId查询
     *
     * @param userId the user id
     *
     * @return the uac group user
     */
    UacGroupUser queryByUserId(Long userId);

    /**
     * 根据userId和version修改
     *
     * @param uacGroupUser the uac group user
     *
     * @return the int
     */
    int updateByUserId(UacGroupUser uacGroupUser);

    /**
     * 通过用户Id获取组织信息
     *
     * @param userId the user id
     *
     * @return the group list by user id
     */
    List<UacGroup> getGroupListByUserId(Long userId);

    /**
     * Save user group.
     *
     * @param id      the id
     * @param groupId the group id
     */
    void saveUserGroup(Long id, Long groupId);
}
