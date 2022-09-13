package com.huaihkiss.tcc.user.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huaihkiss.tcc.user.api.UserInfoApi;
import com.huaihkiss.tcc.user.object.dto.AddPointsDTO;
import com.huaihkiss.tcc.user.service.IUserInfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author huaihkiss
 * @since 2022-09-12
 */
@Controller
@RequestMapping("/user/userInfo")
public class UserInfoController implements UserInfoApi{
    @Autowired
    private IUserInfoService userInfoService;

    @PostMapping("/points")
    @ResponseBody
    public String addPoint(@RequestBody AddPointsDTO addPointsDTO){
        return userInfoService.addPoint(addPointsDTO);
    }
}
