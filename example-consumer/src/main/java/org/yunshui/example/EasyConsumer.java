package org.yunshui.example;

import org.yunshui.example.common.model.User;
import org.yunshui.example.common.service.UserService;

public class EasyConsumer {

    public static void main(String[] args) {
        ///todo 需要获取UserService的实现类对象
        UserService userService = null;
        User user = new User();
        user.setName("yunshui");
        //调用
        User newUser = userService.getUser(user);
        if (newUser != null) {
            System.out.println(newUser.getName());
        } else {
            System.out.println("user = null");
        }
    }
}
