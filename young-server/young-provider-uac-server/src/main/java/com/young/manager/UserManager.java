package com.young.manager;

import com.google.common.base.Preconditions;
import com.young.annotation.MqProducerStore;
import com.young.constant.GlobalConstant;
import com.young.enums.ErrorCodeEnum;
import com.young.enums.MqSendTypeEnum;
import com.young.exception.UacBizException;
import com.young.mapper.UacGroupUserMapper;
import com.young.mapper.UacRoleUserMapper;
import com.young.mapper.UacUserMapper;
import com.young.model.domain.MqMessageData;
import com.young.model.domain.UacGroupUser;
import com.young.model.domain.UacRoleUser;
import com.young.model.domain.UacUser;
import com.young.service.IRedisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 14:25
 * @UpdateUser:
 * @UpdateDate:2019/5/15 14:25
 * @UpdateRemark:
 * @Version:
 */
@Slf4j
@Component
@Transactional(rollbackFor = Exception.class)
public class UserManager {
    @Resource
    private UacUserMapper uacUserMapper;
    @Resource
    private UacRoleUserMapper uacRoleUserMapper;
    @Resource
    private UacGroupUserMapper uacGroupUserMapper;
    @Resource
    private IRedisService redisService;

    @MqProducerStore(sendType = MqSendTypeEnum.SAVE_AND_SEND)
    public void submitResetPwdEmail(final MqMessageData messageData) {
        log.info("重置密码发送邮件. messageData={}", messageData);
    }

    @MqProducerStore
    public void register(final MqMessageData mqMessageData, final UacUser uacUser) {
        log.info("注册用户. mqMessageData={}, user={}", mqMessageData, uacUser);
        uacUserMapper.insertSelective(uacUser);
    }

    @MqProducerStore
    public void resetLoginPwd(final MqMessageData mqMessageData, final UacUser update) {
        log.info("重置密码. mqMessageData={}, user={}", mqMessageData, update);
        int updateResult = uacUserMapper.updateByPrimaryKeySelective(update);
        if (updateResult < 1) {
            log.error("用户【 {} 】重置密码失败", update.getLoginName());
        } else {
            log.info("用户【 {} 】重置密码失败", update.getLoginName());
        }
    }

    @MqProducerStore
    public void activeUser(final MqMessageData mqMessageData, final UacUser uacUser, final String activeUserKey) {
        log.info("激活用户. mqMessageData={}, user={}", mqMessageData, uacUser);
        int result = uacUserMapper.updateByPrimaryKeySelective(uacUser);
        if (result < 1) {
            throw new UacBizException(ErrorCodeEnum.UAC10011038, uacUser.getId());
        }
        // 绑定一个访客角色默认值roleId=10000
        final Long userId = uacUser.getId();
        Preconditions.checkArgument(userId != null, "用户id不能为空");
        final Long roleId = 10000L;
        UacRoleUser roleUser = new UacRoleUser();
        roleUser.setUserId(userId);
        roleUser.setRoleId(roleId);
        uacRoleUserMapper.insertSelective(roleUser);
        // 绑定一个组织
        UacGroupUser groupUser = new UacGroupUser();
        groupUser.setUserId(userId);
        groupUser.setGroupId(GlobalConstant.Sys.SUPER_MANAGER_GROUP_ID);
        uacGroupUserMapper.insertSelective(groupUser);
        // 删除 activeUserToken
        redisService.deleteKey(activeUserKey);
    }

    @MqProducerStore(sendType = MqSendTypeEnum.SAVE_AND_SEND)
    public void sendSmsCode(final MqMessageData mqMessageData) {
        log.info("发送短信验证码. mqMessageData={}", mqMessageData);
    }

    @MqProducerStore(sendType = MqSendTypeEnum.SAVE_AND_SEND)
    public void sendEmailCode(final MqMessageData mqMessageData) {
        log.info("发送邮件验证码. mqMessageData={}", mqMessageData);
    }
}
