package com.young.service;

import com.github.pagehelper.PageInfo;
import com.young.model.domain.UacAction;
import com.young.model.domain.UacMenu;
import com.young.model.dto.ActionMainQueryDto;
import com.young.model.dto.LoginAuthDto;
import com.young.model.vo.MenuVo;
import com.young.support.IService;

import java.util.List;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 14:24
 * @UpdateUser:
 * @UpdateDate:2019/5/15 14:24
 * @UpdateRemark:
 * @Version:
 */
public interface IUacActionService extends IService<UacAction> {
    /**
     * Query action list with page page info.
     *
     * @param actionMainQueryDto the action main query dto
     * @return the page info
     */
    PageInfo queryActionListWithPage(ActionMainQueryDto actionMainQueryDto);

    /**
     * Delete action by id int.
     *
     * @param actionId the action id
     * @return the int
     */
    int deleteActionById(Long actionId);

    /**
     * Batch delete by id list.
     *
     * @param deleteIdList the delete id list
     */
    void batchDeleteByIdList(List<Long> deleteIdList);

    /**
     * Save action.
     *
     * @param action       the action
     * @param loginAuthDto the login auth dto
     */
    void saveAction(UacAction action, LoginAuthDto loginAuthDto);

    /**
     * Delete by menu id int.
     *
     * @param id the id
     * @return the int
     */
    int deleteByMenuId(Long id);

    /**
     * Gets checked auth list.
     *
     * @param roleId the role id
     * @return the checked auth list
     */
    List<Long> getCheckedActionList(Long roleId);

    /**
     * Gets own auth list.
     *
     * @param userId the user id
     * @return the own auth list
     */
    List<MenuVo> getOwnAuthList(Long userId);

    /**
     * Gets checked menu list.
     *
     * @param roleId the role id
     * @return the checked menu list
     */
    List<Long> getCheckedMenuList(Long roleId);

    /**
     * 根据用户Id查询拥有的按钮权限.
     *
     * @param userId the user id
     * @return the own uac action list
     */
    List<UacAction> getOwnActionListByUserId(Long userId);

    /**
     * 根据角色ID查询权限列表.
     *
     * @param roleId the role id
     * @return the list
     */
    List<UacAction> listActionListByRoleId(Long roleId);

    /**
     * 根据菜单ID List 查询权限列表.
     *
     * @param uacMenus the uac menus
     * @return the list
     */
    List<UacAction> listActionList(List<UacMenu> uacMenus);

    /**
     * Matches by url uac action.
     *
     * @param requestUrl the request url
     * @return the uac action
     */
    UacAction matchesByUrl(String requestUrl);
}

