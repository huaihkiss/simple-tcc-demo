package com.huaihkiss.tcc.account.controller;

import com.huaihkiss.tcc.account.api.AccountApi;
import com.huaihkiss.tcc.account.object.dto.AccountDto;
import com.huaihkiss.tcc.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AccountController implements AccountApi {
    @Autowired
    private AccountService accountService;
    @PostMapping("updateAccount")
    @Override
    public Integer updateAccount(@RequestBody AccountDto dto) {
        return accountService.updateAccount(dto);
    }
}
