package com.young.mapper;

import com.young.model.domain.UacRoleUser;
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
public interface UacRoleUserMapper extends MyMapper<UacRoleUser> {
    /**
     * Delete exclude super mng int.
     *
     * @param currentRoleId the current role id
     * @param superRoleId   the super role id
     * @return the int
     */
    int deleteExcludeSuperMng(@Param("currentRoleId") Long currentRoleId, @Param("superRoleId") Long superRoleId);

    /**
     * Gets by user id and role id.
     *
     * @param userId the user id
     * @param roleId the role id
     * @return the by user id and role id
     */
    UacRoleUser getByUserIdAndRoleId(@Param("userId") Long userId, @Param("roleId") Long roleId);

    /**
     * List by user id list.
     *
     * @param userId the user id
     * @return the list
     */
    List<UacRoleUser> listByUserId(@Param("userId") Long userId);

    /**
     * List by role id list.
     *
     * @param roleId the role id
     * @return the list
     */
    List<UacRoleUser> listByRoleId(@Param("roleId") Long roleId);

    /**
     * List super user list.
     *
     * @param roleId the role id
     * @return the list
     */
    List<Long> listSuperUser(@Param("roleId") Long roleId);

    /**
     * List by role id list list.
     *
     * @param idList the id list
     * @return the list
     */
    List<UacRoleUser> listByRoleIdList(@Param("roleIds") List<Long> idList);

    /**
     * Delete by role id int.
     *
     * @param roleId the role id
     * @return the int
     */
    int deleteByRoleId(@Param("roleId") Long roleId);

    /**
     * Delete by role id list int.
     *
     * @param roleIdList the role id list
     * @return the int
     */
    int deleteByRoleIdList(@Param("roleIdList") List<Long> roleIdList);
}