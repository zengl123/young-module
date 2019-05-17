package com.young.mapper;

import com.young.model.domain.UacRoleMenu;
import com.young.model.vo.MenuCountVo;
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
 * @CreateDate:2019/5/17 13:41
 * @UpdateUser:
 * @UpdateDate:2019/5/17 13:41
 * @UpdateRemark:
 * @Version:
 */
@Mapper
@Component
public interface UacRoleMenuMapper extends MyMapper<UacRoleMenu> {
    /**
     * Count child menu num list.
     *
     * @param roleId the role id
     *
     * @return the list
     */
    List<MenuCountVo> countChildMenuNum(Long roleId);

    /**
     * Add role menu list int.
     *
     * @param addUacRoleMenuList the add uac role menu list
     *
     * @return the int
     */
    int addRoleMenuList(List<UacRoleMenu> addUacRoleMenuList);


    /**
     * Delete by role id list int.
     *
     * @param roleIdList the role id list
     *
     * @return the int
     */
    int deleteByRoleIdList(@Param("roleIdList") List<Long> roleIdList);
}