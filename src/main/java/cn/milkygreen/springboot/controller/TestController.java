/*
 *   阔地教育科技有限公司版权所有（codyy.com/codyy.cn）
 *   Copyright (c) 2017, Codyy and/or its affiliates. All rights reserved.
 */
package cn.milkygreen.springboot.controller;

import cn.milkygreen.springboot.entity.User;
import cn.milkygreen.springboot.service.UserService;
import cn.milkygreen.springboot.utils.ConfigUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    private UserService userService;

    @RequestMapping("hello")
    public String hello(){
        return "hello springboot" + " 。config=" + config + " 。configUtil.filterConfig=" + configUtil.getFilterConfig();
    }

    @RequestMapping("searchuser")
    public User searchUser(String userName){
        return userService.findByUserName(userName);
    }

}
