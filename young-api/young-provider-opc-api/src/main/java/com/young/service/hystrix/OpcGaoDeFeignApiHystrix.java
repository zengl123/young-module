package com.young.service.hystrix;

import com.young.model.dto.gaode.GaoDeLocation;
import com.young.service.OpcGaoDeFeignApi;
import com.young.wrapper.Wrapper;
import org.springframework.stereotype.Component;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/17 16:05
 * @UpdateUser:
 * @UpdateDate:2019/5/17 16:05
 * @UpdateRemark:
 * @Version:
 */
@Component
public class OpcGaoDeFeignApiHystrix implements OpcGaoDeFeignApi {

    @Override
    public Wrapper<GaoDeLocation> getLocationByIpAddr(final String ipAddr) {
        return null;
    }
}
