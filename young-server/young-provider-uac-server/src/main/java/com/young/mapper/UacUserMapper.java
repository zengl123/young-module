package com.young.mapper;

import com.young.model.domain.UacUser;
import com.young.model.dto.BindRoleDto;
import com.young.mybatis.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 11:05
 * @UpdateUser:
 * @UpdateDate:2019/5/15 11:05
 * @UpdateRemark:
 * @Version:
 */
@Mapper
@Component
public interface UacUserMapper extends MyMapper<UacUser> {

    /**
     * Find by login name uac user.
     *
     * @param loginName the login name
     * @return the uac user
     */
    UacUser findByLoginName(String loginName);

    /**
     * Find by mobile no uac user.
     *
     * @param mobileNo the mobile no
     * @return the uac user
     */
    UacUser findByMobileNo(@Param("mobileNo") String mobileNo);

    /**
     * Find by login name and login pwd uac user.
     *
     * @param loginNamePwdMap the login name pwd map
     * @return the uac user
     */
    UacUser findByLoginNameAndLoginPwd(Map<String, String> loginNamePwdMap);

    /**
     * Select user list list.
     *
     * @param uacUser the uac user
     * @return the list
     */
    List<UacUser> selectUserList(UacUser uacUser);

    /**
     * Select user info by user id uac user.
     *
     * @param userId the user id
     * @return the uac user
     */
    UacUser selectUserInfoByUserId(Long userId);

    /**
     * Update uac user int.
     *
     * @param user the user
     * @return the int
     */
    int updateUacUser(UacUser user);

    /**
     * Select all need bind role list.
     *
     * @param superManagerRoleId the super manager role id
     * @return the list
     */
    List<BindRoleDto> selectAllNeedBindRole(@Param("superManagerRoleId") Long superManagerRoleId);

    /**
     * Find user info by login name uac user.
     *
     * @param loginName the login name
     * @return the uac user
     */
    UacUser findUserInfoByLoginName(@Param("loginName") String loginName);
}
