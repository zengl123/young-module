package com.young.mapper;

import com.young.model.domain.UacMenu;
import com.young.model.vo.MenuVo;
import com.young.mybatis.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 11:39
 * @UpdateUser:
 * @UpdateDate:2019/5/15 11:39
 * @UpdateRemark:
 * @Version:
 */
@Mapper
@Component
public interface UacMenuMapper extends MyMapper<UacMenu> {
    /**
     * Find menu vo list by user id list.
     *
     * @param userId the user id
     * @return the list
     */
    List<MenuVo> findMenuVoListByUserId(Long userId);

    /**
     * Find menu code list by user id list.
     *
     * @param userId the user id
     * @return the list
     */
    List<String> findMenuCodeListByUserId(Long userId);

    /**
     * Select menu list list.
     *
     * @param uacMenu the uac menu
     * @return the list
     */
    List<UacMenu> selectMenuList(UacMenu uacMenu);

    /**
     * Select menu child count by pid int.
     *
     * @param pid the pid
     * @return the int
     */
    int selectMenuChildCountByPid(Long pid);

    /**
     * Select by url uac menu.
     *
     * @param url the url
     * @return the uac menu
     */
    UacMenu selectByUrl(String url);

    /**
     * Update menu int.
     *
     * @param uacMenu the uac menu
     * @return the int
     */
    int updateMenu(UacMenu uacMenu);

    /**
     * 根据角色ID查询菜单列表.
     *
     * @param roleId the role id
     * @return the list
     */
    List<UacMenu> listMenuListByRoleId(@Param("roleId") Long roleId);

    /**
     * List menu list.
     *
     * @param menuIdList the menu id list
     * @return the list
     */
    List<UacMenu> listMenu(@Param("menuIdList") Set<Long> menuIdList);
}