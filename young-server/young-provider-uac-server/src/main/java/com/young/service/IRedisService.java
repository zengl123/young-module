package com.young.service;

import java.util.concurrent.TimeUnit;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 14:16
 * @UpdateUser:
 * @UpdateDate:2019/5/15 14:16
 * @UpdateRemark:
 * @Version:
 */
public interface IRedisService {

    /**
     * Gets key.
     *
     * @param key the key
     *
     * @return the key
     */
    String getKey(String key);

    /**
     * Delete key.
     *
     * @param key the key
     */
    void deleteKey(String key);

    /**
     * Sets key.
     *
     * @param key   the key
     * @param value the value
     */
    void setKey(String key, String value);

    /**
     * Sets key.
     *
     * @param key     the key
     * @param value   the value
     * @param timeout the timeout
     * @param unit    the unit
     */
    void setKey(String key, String value, final long timeout, final TimeUnit unit);
}

