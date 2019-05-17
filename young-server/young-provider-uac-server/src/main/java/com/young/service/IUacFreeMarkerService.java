package com.young.service;

import freemarker.template.TemplateException;

import java.io.IOException;
import java.util.Map;

/**
 * Copyright (C), 2018-2019, 湖南金峰信息科技有限公司
 *
 * @Description:
 * @Author:zengling
 * @钉钉:17363645521
 * @CreateDate:2019/5/15 14:46
 * @UpdateUser:
 * @UpdateDate:2019/5/15 14:46
 * @UpdateRemark:
 * @Version:
 */
public interface IUacFreeMarkerService {

    /**
     * Gets template.
     *
     * @param map              the map
     * @param templateLocation the template location
     *
     * @return the template
     *
     * @throws IOException       the io exception
     * @throws TemplateException the template exception
     */
    String getTemplate(Map<String, Object> map, String templateLocation) throws IOException, TemplateException;
}
