package com.huaihkiss.tcc.user.api;

import com.huaihkiss.tcc.user.object.dto.AddPointsDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("user-service")
@RequestMapping("/user/userInfo")
public interface UserInfoApi {
    @PostMapping("/points")
    String addPoint(@RequestBody AddPointsDTO addPointsDTO);
}
