package com.huaihkiss.tcc.user.object.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class AddPointsDTO implements Serializable{
    
    private Long userId;

    private Integer points;
}
