package com.huaihkiss.tcc.user.controller;

import com.huaihkiss.tcc.user.api.UserApi;
import com.huaihkiss.tcc.user.object.dto.UserDto;
import com.huaihkiss.tcc.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserApi {
    @Autowired
    private UserService userService;
    @PostMapping("updateUser")
    @Override
    public String updateUser(@RequestBody UserDto dto) {
        return userService.updateUser(dto);
    }
}
