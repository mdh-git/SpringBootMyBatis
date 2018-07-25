package com.mdh.service;

import com.mdh.model.User;

import java.util.List;

/**
 * Created by mdh on 2018/7/9.
 */
public interface UserService {

    int addUser(User user);

    List<User> findAllUser(int pageNum,int pageSize);

    User getUser(Integer userId);

    List<User> findUserByPage(int currentPage,int pageSize);
}
