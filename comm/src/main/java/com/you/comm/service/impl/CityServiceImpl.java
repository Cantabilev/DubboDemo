package com.you.comm.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.you.comm.service.CityService;

/**
 * @author liuqiqi
 * @date 2019/1/21 13:15
 */
@Service(provider = "providerConfigRmi")
public class CityServiceImpl implements CityService {
    @Override
    public String getCity(Integer num) {
        return "获取城市ID："+num;
    }
}
