package com.huaihkiss.tcc.bussiness.object.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class AddOrderDTO implements Serializable{
    private Long userId;

    private Integer amount;
}
