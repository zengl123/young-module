package com.young.mapper;

import com.young.model.domain.UacGroup;
import com.young.model.domain.UacGroupUser;
import com.young.mybatis.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 14:26
 * @UpdateUser:
 * @UpdateDate:2019/5/15 14:26
 * @UpdateRemark:
 * @Version:
 */
@Mapper
@Component
public interface UacGroupUserMapper extends MyMapper<UacGroupUser> {
    /**
     * Query by user id uac group user.
     *
     * @param userId the user id
     * @return the uac group user
     */
    UacGroupUser getByUserId(Long userId);

    /**
     * Update by user id int.
     *
     * @param uacGroupUser the uac group user
     * @return the int
     */
    int updateByUserId(UacGroupUser uacGroupUser);

    /**
     * Select group list by user id list.
     *
     * @param userId the user id
     * @return the list
     */
    List<UacGroup> selectGroupListByUserId(Long userId);

    /**
     * List by group id list.
     *
     * @param groupId the group id
     * @return the list
     */
    List<UacGroupUser> listByGroupId(@Param("groupId") Long groupId);

    /**
     * Delete exclude super mng int.
     *
     * @param groupId            the group id
     * @param superManagerRoleId the super manager role id
     * @return the int
     */
    int deleteExcludeSuperMng(@Param("currentGroupId") Long groupId, @Param("superManagerRoleId") Long superManagerRoleId);
}