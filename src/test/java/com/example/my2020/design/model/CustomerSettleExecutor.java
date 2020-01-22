package com.example.my2020.design.model;

public class CustomerSettleExecutor extends AbstractSettleExecutor {
    @Override
    protected void execute() {
        System.out.println("个人结算处理器");
    }

    @Override
    protected boolean isMatch(SettleContext settleContext) {
        if(settleContext.getFlag() == FlagEnum.CUSTOMER){
            System.out.println("匹配个人");
            return true;
        }
        return false;
    }
}
