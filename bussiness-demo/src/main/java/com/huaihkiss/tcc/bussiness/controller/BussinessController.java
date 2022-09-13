package com.huaihkiss.tcc.bussiness.controller;

import com.huaihkiss.tcc.bussiness.object.dto.AddOrderDTO;
import com.huaihkiss.tcc.bussiness.object.dto.BussinessDto;
import com.huaihkiss.tcc.bussiness.service.BussinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BussinessController {
    @Autowired
    private BussinessService bussinessService;
    @PostMapping("echo")
    public String echo(@RequestBody BussinessDto dto){
        return bussinessService.echo(dto);
    }

    @ResponseBody
    @PostMapping("addOrder")
    public String addOrder(@RequestBody AddOrderDTO dto){
        return bussinessService.addOrder(dto);
    }
}
