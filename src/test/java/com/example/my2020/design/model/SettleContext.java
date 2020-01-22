package com.example.my2020.design.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SettleContext {
    /**
     * 1-机构
     * 2-个人
     */
    private FlagEnum flag;
}
