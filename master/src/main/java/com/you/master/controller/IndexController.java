package com.you.master.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.you.comm.service.CityService;
import com.you.comm.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuqiqi
 * @date 2019/1/22 10:31
 */
@RestController
@RequestMapping("/")
public class IndexController {

    @Reference(interfaceClass = UserService.class)
    private UserService userService;

    @Reference
    private CityService cityService;

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public String getUser(Integer num){

        return userService.getUser(num);
    }

    @RequestMapping(value = "/getCity", method = RequestMethod.GET)
    public String getCity(Integer num){

        return cityService.getCity(num);
    }
}
