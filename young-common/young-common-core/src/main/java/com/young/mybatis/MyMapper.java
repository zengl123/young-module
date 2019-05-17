package com.young.mybatis;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 11:06
 * @UpdateUser:
 * @UpdateDate:2019/5/15 11:06
 * @UpdateRemark:
 * @Version:
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}

