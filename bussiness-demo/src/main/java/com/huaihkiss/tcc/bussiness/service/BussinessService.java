package com.huaihkiss.tcc.bussiness.service;

import com.huaihkiss.tcc.bussiness.object.dto.AddOrderDTO;
import com.huaihkiss.tcc.bussiness.object.dto.BussinessDto;

public interface BussinessService {
    public String echo( BussinessDto dto);

    String addOrder(AddOrderDTO dto);
}
