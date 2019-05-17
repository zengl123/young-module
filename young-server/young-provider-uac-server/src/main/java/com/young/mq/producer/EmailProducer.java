package com.young.mq.producer;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Preconditions;
import com.young.RedisKeyUtil;
import com.young.constant.AliyunMqTopicConstant;
import com.young.enums.ErrorCodeEnum;
import com.young.enums.UacEmailTemplateEnum;
import com.young.exception.UacBizException;
import com.young.model.PcSendEmailRequest;
import com.young.model.domain.MqMessageData;
import com.young.service.IUacFreeMarkerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Map;
import java.util.Set;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 14:44
 * @UpdateUser:
 * @UpdateDate:2019/5/15 14:44
 * @UpdateRemark:
 * @Version:
 */
@Slf4j
@Component
public class EmailProducer {
    @Resource
    private IUacFreeMarkerService uacFreeMarkerService;

    /**
     * Send email mq.
     *
     * @param emailSet          the email set
     * @param emailTemplateEnum the email template enum
     * @param param             the param
     */
    public MqMessageData sendEmailMq(Set<String> emailSet, UacEmailTemplateEnum emailTemplateEnum, AliyunMqTopicConstant.MqTagEnum tagEnum, Map<String, Object> param) {
        log.info("pcSendEmailRequest - 发送邮件MQ. emailSet={}, param={}", emailSet, param);
        String msgBody;
        try {
            Preconditions.checkArgument(emailTemplateEnum != null, "邮箱模板信息不存在");
            PcSendEmailRequest request = new PcSendEmailRequest();
            String templateLocation = emailTemplateEnum.getLocation();
            String text = uacFreeMarkerService.getTemplate(param, templateLocation);
            request.setText(text);
            request.setTo(emailSet);
            request.setSubject(emailTemplateEnum.getSubject());
            msgBody = JSON.toJSONString(request);
        } catch (Exception e) {
            log.error("发送邮件验证码 smsMessage转换为json字符串失败", e);
            throw new UacBizException(ErrorCodeEnum.UAC10011021);
        }
        String topic = tagEnum.getTopic();
        String tag = tagEnum.getTag();
        String key = RedisKeyUtil.createMqKey(topic, tag, emailSet.toString(), msgBody);
        return new MqMessageData(msgBody, topic, tag, key);
    }
}
