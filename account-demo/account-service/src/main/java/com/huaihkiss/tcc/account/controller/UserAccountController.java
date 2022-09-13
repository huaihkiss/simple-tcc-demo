package com.huaihkiss.tcc.account.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huaihkiss.tcc.account.api.UserAccountApi;
import com.huaihkiss.tcc.account.object.dto.SubmitOrderDTO;
import com.huaihkiss.tcc.account.service.IUserAccountService;

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
@RequestMapping("/account/userAccount")
public class UserAccountController implements UserAccountApi{
    @Autowired
    private IUserAccountService userAccountService;

    @PostMapping("/order")
    @ResponseBody
    public Integer addOrder(@RequestBody SubmitOrderDTO submitOrderDTO){
        return userAccountService.addOrder(submitOrderDTO);

    }

}
