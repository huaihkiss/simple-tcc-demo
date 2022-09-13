package com.huaihkiss.tcc.account.api;

import com.huaihkiss.tcc.account.object.dto.AccountDto;
import com.huaihkiss.tcc.account.object.dto.SubmitOrderDTO;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("account-service")
@RequestMapping("/account/userAccount")
public interface UserAccountApi {

    @PostMapping("/order")
    Integer addOrder(@RequestBody SubmitOrderDTO submitOrderDTO);
}
