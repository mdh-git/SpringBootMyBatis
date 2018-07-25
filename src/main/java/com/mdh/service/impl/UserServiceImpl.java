package com.mdh.service.impl;

import com.github.pagehelper.PageHelper;
import com.mdh.mapper.UserMapper;
import com.mdh.model.User;
import com.mdh.service.UserService;
import com.mdh.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mdh on 2018/7/9.
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /*@Override
    public int addUser(User user) {
        return userMapper.insertSelective(user);
    }*/

    /*
    * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
    * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
    * pageNum 开始页数
    * pageSize 每页显示的数据条数
    * */
    /*@Override
    public List<User> findAllUser(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        //PageHelper.startPage(pageNum, pageSize);
        return userMapper.selectAllUser();
    }*/

    @Override
    public int addUser(User user) {
        return 0;
    }

    @Override
    public List<User> findAllUser(int pageNum, int pageSize) {
        return null;
    }

    @Override
    public User getUser(Integer userId) {
        return userMapper.getUser(userId);
    }

    @Override
    public List<User> findUserByPage(int currentPage, int pageSize) {
        //设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
        PageHelper.startPage(currentPage, pageSize);
        List<User> list = userMapper.findAllUser();
        int countNums = userMapper.countFindAllUser();
        PageBean<User> pageData = new PageBean<>(currentPage, pageSize, countNums);
        pageData.setItems(list);
        return pageData.getItems();
    }
}
