package com.young.service.hystrix;

import com.young.model.dto.robot.ChatRobotMsgDto;
import com.young.service.DingTalkFeignApi;
import com.young.wrapper.Wrapper;
import org.springframework.stereotype.Component;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/17 16:03
 * @UpdateUser:
 * @UpdateDate:2019/5/17 16:03
 * @UpdateRemark:
 * @Version:
 */
@Component
public class DingTalkFeignApiHystrix implements DingTalkFeignApi {

    @Override
    public Wrapper<Boolean> sendChatRobotMsg(final ChatRobotMsgDto uacUserReqDto) {
        return null;
    }
}
