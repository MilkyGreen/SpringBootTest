/*
 *   阔地教育科技有限公司版权所有（codyy.com/codyy.cn）
 *   Copyright (c) 2017, Codyy and/or its affiliates. All rights reserved.
 */
package cn.milkygreen.springboot.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author liyunmeng
 * @Description:
 * @Date 2018/5/24 9:51
 */
@Component
public class ConfigUtil {

    @Value("${filter.config}")
    private String filterConfig;

    public String getFilterConfig() {
        return filterConfig;
    }

    public void setFilterConfig(String filterConfig) {
        this.filterConfig = filterConfig;
    }
}
