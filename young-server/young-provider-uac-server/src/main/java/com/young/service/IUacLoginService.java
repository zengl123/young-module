package com.young.service;

import com.young.model.dto.LoginRespDto;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/14 17:28
 * @UpdateUser:
 * @UpdateDate:2019/5/14 17:28
 * @UpdateRemark:
 * @Version:
 */
public interface IUacLoginService {
    /**
     * Login after login resp dto.
     *
     * @param applicationId the application id
     *
     * @return the login resp dto
     */
    LoginRespDto loginAfter(Long applicationId);
}
