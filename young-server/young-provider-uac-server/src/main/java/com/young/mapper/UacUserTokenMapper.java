package com.young.mapper;

import com.young.model.domain.UacUserToken;
import com.young.mybatis.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 15:38
 * @UpdateUser:
 * @UpdateDate:2019/5/15 15:38
 * @UpdateRemark:
 * @Version:
 */
@Mapper
@Component
public interface UacUserTokenMapper extends MyMapper<UacUserToken> {
    /**
     * Select token list list.
     *
     * @param userToken the user token
     * @return the list
     */
    List<UacUserToken> selectTokenList(UacUserToken userToken);

    /**
     * 超时token更新为离线.
     *
     * @param map the map
     * @return the int
     */
    int batchUpdateTokenOffLine(Map<String, Object> map);

    /**
     * 查询超时token Id 集合.
     *
     * @return the list
     */
    List<Long> listOffLineTokenId();
}
