package com.yhr.controller;
import com.yhr.sevice.Userservice;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: dubbo_controller
 * @description: 测试dubbo
 * @packagename: com.yhr.controller
 * @author: yanghongrong
 * @date: 2021-07-09 00:19
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Reference //远程调用
    private Userservice userservice;

    /**
     *  1.从zookeeper 注册中心 获取userservice的访问url
     *  2.进行远程调用RPC
     *  3.将结果封装为一个代理对象,给变量赋值
     * @return
     */
    @RequestMapping("/hellodubbo")
    public String quer(){
        return userservice.query();
    }
}
