package com.yhr.sevice.impl;

import com.yhr.sevice.Userservice;
import org.apache.dubbo.config.annotation.Service;

/**
 * @program: dobbo_service
 * @description:
 * @packagename: com.yhr.sevice.impl
 * @author: yanghongrong
 * @date: 2021-07-08 23:49
 **/
@Service
public class UserserviceImpl implements Userservice {
    @Override
    public String query() {
        return "hello Dubbo";
    }
}
