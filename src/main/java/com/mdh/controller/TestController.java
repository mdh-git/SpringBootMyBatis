package com.mdh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by mdh on 2018/7/9.
 */
@Controller
public class TestController {

    @RequestMapping("/hello")
    @ResponseBody
    public String index() {
        //logger.info("进入index方法");
        return "Hello Spring Boot !";
    }
}
