package com.lss.springcloud.controller;

import com.lss.springcloud.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sean.liu on 2017/4/17.
 */
@RestController
public class HiController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hi/{msg}")
    public String sayHi(@PathVariable("msg") String msg) {
        return helloService.hiService(msg);
    }
}
