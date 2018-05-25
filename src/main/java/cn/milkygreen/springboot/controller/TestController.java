/*
 *   阔地教育科技有限公司版权所有（codyy.com/codyy.cn）
 *   Copyright (c) 2017, Codyy and/or its affiliates. All rights reserved.
 */
package cn.milkygreen.springboot.controller;

import cn.milkygreen.springboot.dao.AppInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.milkygreen.springboot.utils.ConfigUtil;

/**
 * @author liyunmeng
 * @Description:
 * @Date 2018/5/23 15:50
 */
@RestController
public class TestController {

    @Value("${filter.config}")
    private String config;

    @Autowired
    private ConfigUtil configUtil;

    @Autowired
    private AppInfoMapper appInfoMapper;


    @RequestMapping("hello")
    public String hello(){
        return "hello springboot" + " 。config=" + config + " 。configUtil.filterConfig=" + configUtil.getFilterConfig();
    }

    @RequestMapping("getappinfo")
    public String getappinfo(){
        return "getappinfo=" + appInfoMapper.getAll();
    }

}
