package com.mdh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by mdh on 2018/7/10.
 */
@RestController
public class DemoController {
    @RequestMapping("/demo")
    public ModelAndView index() {
        return new ModelAndView("demo");
    }
}
