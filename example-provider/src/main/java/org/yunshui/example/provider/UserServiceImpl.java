package org.yunshui.example.provider;

import org.yunshui.example.common.model.User;
import org.yunshui.example.common.service.UserService;

public class UserServiceImpl implements UserService {

    public User getUser(User user) {
        System.out.println("用户名：" + user.getName());
        return user;
    }
}
