package com.huaihkiss.tcc.user.api;

import com.huaihkiss.tcc.user.object.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

// @FeignClient("user-service")
public interface UserApi {
    @PostMapping("updateUser")
    String updateUser(UserDto dto);
}
