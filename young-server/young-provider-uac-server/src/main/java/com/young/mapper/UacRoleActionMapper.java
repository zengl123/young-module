package com.young.mapper;

import com.young.model.domain.UacRoleAction;
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
 * @CreateDate:2019/5/17 13:44
 * @UpdateUser:
 * @UpdateDate:2019/5/17 13:44
 * @UpdateRemark:
 * @Version:
 */
@Mapper
@Component
public interface UacRoleActionMapper extends MyMapper<UacRoleAction> {
    /**
     * Delete by action id int.
     *
     * @param actionId the action id
     *
     * @return the int
     */
    int deleteByActionId(@Param("actionId") Long actionId);

    /**
     * Delete by role id list int.
     *
     * @param roleIdList the role id list
     *
     * @return the int
     */
    int deleteByRoleIdList(@Param("roleIdList") List<Long> roleIdList);
}