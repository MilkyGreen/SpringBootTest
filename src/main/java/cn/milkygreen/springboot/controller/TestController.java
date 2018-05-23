/*
 *   阔地教育科技有限公司版权所有（codyy.com/codyy.cn）
 *   Copyright (c) 2017, Codyy and/or its affiliates. All rights reserved.
 */
package cn.milkygreen.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liyunmeng
 * @Description:
 * @Date 2018/5/23 15:50
 */
@RestController
public class TestController {

    @RequestMapping("hello")
    public String hello(){
        return "hello springboot";
    }

}
