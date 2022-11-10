package com.example.controller;

import com.example.common.Result;
import com.example.entity.Authority;
import com.example.mapper.UserMapper1;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class IndexController {
    @Resource
    private UserMapper1 userMapper1;

    @PostMapping("/login")
    public Result<Authority> login(@RequestBody Authority authority) {
        if (!checkParam(authority)) {
            return Result.error("-1", "缺少必要参数");
        }
        Authority dbUser = userMapper1.selectByUsernameAndPassword(authority);
        if (dbUser == null) {
            return Result.error("-1", "账号或密码错误");
        }
        return Result.success(dbUser);
    }
    private boolean checkParam(Authority authority) {
        return authority.getName() != null && authority.getPassword() != null;
    }
}
