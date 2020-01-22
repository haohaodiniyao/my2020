package com.example.my2020.design.model;

public enum FlagEnum {
    BUSINESS(1,"机构"),
    CUSTOMER(2,"个人");
    private int code;
    private String desc;

    FlagEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static FlagEnum getByCode(int code){
        for(FlagEnum flagEnum:FlagEnum.values()){
            if(flagEnum.code == code){
                return flagEnum;
            }
        }
        return null;
    }
}
