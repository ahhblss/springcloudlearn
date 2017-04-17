package com.lss.springcloud.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sean.liu on 2017/4/17.
 */
@RestController
public class HiController {

    @RequestMapping("/hi/{msg}")
    public String sayHi(@PathVariable("msg") String msg){
        return msg+" from" + 8763;
    }
}
