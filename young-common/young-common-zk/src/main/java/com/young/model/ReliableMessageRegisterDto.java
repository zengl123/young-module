package com.young.model;

import com.google.common.base.Preconditions;
import lombok.Data;
import org.apache.commons.lang.StringUtils;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 12:30
 * @UpdateUser:
 * @UpdateDate:2019/5/15 12:30
 * @UpdateRemark:
 * @Version:
 */
@Data
public class ReliableMessageRegisterDto {
    private String consumerGroup;
    private String producerGroup;
    private String nameServerAddr;

    /**
     * Sets consumer group.
     *
     * @param consumerGroup the consumer group
     *
     * @return the consumer group
     */
    public ReliableMessageRegisterDto setConsumerGroup(final String consumerGroup) {
        Preconditions.checkArgument(StringUtils.isNotEmpty(consumerGroup), "init zk cid is null");
        this.consumerGroup = consumerGroup;
        return this;
    }

    /**
     * Sets producer group.
     *
     * @param producerGroup the producer group
     *
     * @return the producer group
     */
    public ReliableMessageRegisterDto setProducerGroup(final String producerGroup) {
        Preconditions.checkArgument(StringUtils.isNotEmpty(producerGroup), "init zk pid is null");
        this.producerGroup = producerGroup;
        return this;
    }

    /**
     * Sets namesrv addr.
     *
     * @param nameServerAddr the nameServerAddr addr
     *
     * @return the nameServerAddr addr
     */
    public ReliableMessageRegisterDto setNamesrvAddr(final String nameServerAddr) {
        Preconditions.checkArgument(StringUtils.isNotEmpty(nameServerAddr), "init ZK nameServerAddr is null");
        this.nameServerAddr = nameServerAddr;
        return this;
    }
}

