package com.young.service;

import com.young.model.domain.UacMenu;
import com.young.model.dto.LoginAuthDto;
import com.young.model.dto.UacMenuStatusDto;
import com.young.model.vo.MenuVo;
import com.young.model.vo.ViewMenuVo;
import com.young.support.IService;

import java.util.List;
import java.util.Set;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 10:19
 * @UpdateUser:
 * @UpdateDate:2019/5/15 10:19
 * @UpdateRemark:
 * @Version:
 */
public interface IUacMenuService extends IService<UacMenu> {
    /**
     * Gets menu vo list by user id.
     *
     * @param userId        the user id
     * @param applicationId the application id
     * @return the menu vo list by user id
     */
    List<MenuVo> getMenuVoList(Long userId, Long applicationId);

    /**
     * Save uac menu int.
     *
     * @param uacMenu      the uac menu
     * @param loginAuthDto the login auth dto
     * @return the int
     */
    int saveUacMenu(UacMenu uacMenu, LoginAuthDto loginAuthDto);

    /**
     * Delete uac menu by id int.
     *
     * @param id           the id
     * @param loginAuthDto the login auth dto
     * @return the int
     */
    int deleteUacMenuById(Long id, LoginAuthDto loginAuthDto);

    /**
     * Enable menu list int.
     *
     * @param menuList     the menu list
     * @param loginAuthDto the login auth dto
     * @return the int
     */
    int enableMenuList(List<UacMenu> menuList, LoginAuthDto loginAuthDto);

    /**
     * Gets all parent menu by menu id.
     *
     * @param id the id
     * @return the all parent menu by menu id
     */
    List<UacMenu> getAllParentMenuByMenuId(Long id);

    /**
     * Gets all child menu by menu id.
     *
     * @param id   the id
     * @param type the type
     * @return the all child menu by menu id
     */
    List<UacMenu> getAllChildMenuByMenuId(Long id, String type);

    /**
     * Disable menu list int.
     *
     * @param menuList     the menu list
     * @param loginAuthDto the login auth dto
     * @return the int
     */
    int disableMenuList(List<UacMenu> menuList, LoginAuthDto loginAuthDto);

    /**
     * Select menu list list.
     *
     * @param cusUacMenu the cus uac menu
     * @return the list
     */
    List<UacMenu> selectMenuList(UacMenu cusUacMenu);

    /**
     * Find all menu list by auth res dto list.
     *
     * @param authResDto the auth res dto
     * @return the list
     */
    List<MenuVo> findAllMenuListByAuthResDto(LoginAuthDto authResDto);

    /**
     * Gets vo by id.
     *
     * @param id the id
     * @return the vo by id
     */
    ViewMenuVo getViewVoById(Long id);

    /**
     * Update uac menu status by id.
     *
     * @param uacMenuStatusDto the uac menu status dto
     * @param loginAuthDto     the login auth dto
     */
    void updateUacMenuStatusById(UacMenuStatusDto uacMenuStatusDto, LoginAuthDto loginAuthDto);

    /**
     * 判断菜单是否有子菜单.
     *
     * @param menuId the menu id
     * @return the boolean
     */
    boolean checkMenuHasChildMenu(Long menuId);

    /**
     * 根据角色ID查询菜单列表.
     *
     * @param roleId the role id
     * @return the list
     */
    List<UacMenu> listMenuListByRoleId(Long roleId);

    /**
     * Gets menu list.
     *
     * @param menuIdList the menu id list
     * @return the menu list
     */
    List<UacMenu> getMenuList(Set<Long> menuIdList);
}

