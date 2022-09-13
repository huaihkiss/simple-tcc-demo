package com.huaihkiss.tcc.account.object.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class SubmitOrderDTO implements Serializable{
    
    private Long userId;

    private Integer amount;
}
