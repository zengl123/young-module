package com.young.service.hystrix;

import com.github.pagehelper.PageInfo;
import com.young.model.dto.MessageQueryDto;
import com.young.model.vo.MqMessageVo;
import com.young.service.OpcMqMessageFeignApi;
import com.young.wrapper.Wrapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/17 16:06
 * @UpdateUser:
 * @UpdateDate:2019/5/17 16:06
 * @UpdateRemark:
 * @Version:
 */
@Component
public class OpcMqMessageFeignApiHystrix implements OpcMqMessageFeignApi {

    @Override
    public Wrapper<List<String>> queryMessageKeyList(final List<String> messageKeyList) {
        return null;
    }

    @Override
    public Wrapper<PageInfo<MqMessageVo>> queryMessageListWithPage(final MessageQueryDto messageQueryDto) {
        return null;
    }
}
