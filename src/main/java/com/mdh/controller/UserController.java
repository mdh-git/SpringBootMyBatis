package com.mdh.controller;

import com.mdh.model.User;
import com.mdh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by mdh on 2018/7/9.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/add",produces = {"application/json;charset=UTF-8"})
    public int addUser(User user){
        return userService.addUser(user);
    }

    @RequestMapping("/getItem")
    public String getItem(HttpServletRequest request) {

        //http://localhost:8080/user/getItem?id=1000
        String id = request.getParameter("id");
        //logger.info("进入getItem方法,id:"+id);
        Integer userId = Integer.parseInt(id);
        User user = userService.getUser(userId);
        request.setAttribute("user", user);
        return "/index";
    }

    @RequestMapping("/itemsPage")
    public String itemsPage(HttpServletRequest request) {
        List<User> list = userService.findUserByPage(3,3);
        request.setAttribute("list", list);
        return "/user";
    }
}
