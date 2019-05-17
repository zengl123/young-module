package com.young.service.impl;

import com.young.constant.GlobalConstant;
import com.young.enums.ErrorCodeEnum;
import com.young.exception.MdcBizException;
import com.young.model.dto.gaode.GaoDeLocation;
import com.young.service.IOpcRpcService;
import com.young.service.OpcGaoDeFeignApi;
import com.young.wrapper.Wrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/17 13:56
 * @UpdateUser:
 * @UpdateDate:2019/5/17 13:56
 * @UpdateRemark:
 * @Version:
 */
@Slf4j
@Service
public class OpcRpcServiceImpl implements IOpcRpcService {
    @Resource
    private OpcGaoDeFeignApi opcGaodeFeignApi;

    @Override
    public String getLocationById(String addressId) {
        try {
            Wrapper<GaoDeLocation> wrapper = opcGaodeFeignApi.getLocationByIpAddr(addressId);
            if (wrapper == null) {
                throw new MdcBizException(ErrorCodeEnum.GL99990002);
            }
            if (wrapper.error()) {
                throw new MdcBizException(ErrorCodeEnum.MDC10021002);
            }
            GaoDeLocation result = wrapper.getResult();
            assert result != null;
            return result.getProvince().contains("市") ? result.getCity() : result.getProvince() + GlobalConstant.Symbol.SHORT_LINE + result.getCity();
        } catch (Exception e) {
            log.error("getLocationById={}", e.getMessage(), e);
        }
        return null;
    }
}
