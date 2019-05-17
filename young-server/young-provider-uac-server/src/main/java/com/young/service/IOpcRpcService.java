package com.young.service;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 14:21
 * @UpdateUser:
 * @UpdateDate:2019/5/15 14:21
 * @UpdateRemark:
 * @Version:
 */
public interface IOpcRpcService {
    /**
     * Gets location by id.
     *
     * @param addressId the address id
     *
     * @return the location by id
     */
    String getLocationById(String addressId);
}

