package com.you.comm.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.you.comm.service.UserService;

/**
 * @author liuqiqi
 * @date 2019/1/21 13:15
 */
@Service(provider = "protocolConfigDubbo")
public class UserServiceImpl implements UserService {
    @Override
    public String getUser(Integer num) {
        return "获取用户ID: "+num;
    }
}
