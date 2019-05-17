package com.young.model;

import com.young.service.CoordinatorRegistryCenter;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 12:28
 * @UpdateUser:
 * @UpdateDate:2019/5/15 12:28
 * @UpdateRemark:
 * @Version:
 */
@Data
@AllArgsConstructor
public class RegisterDto {

    private String app;

    private String host;

    private CoordinatorRegistryCenter coordinatorRegistryCenter;

}
