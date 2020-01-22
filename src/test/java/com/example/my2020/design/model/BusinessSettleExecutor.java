package com.example.my2020.design.model;

public class BusinessSettleExecutor extends AbstractSettleExecutor {
    @Override
    protected void execute() {
        System.out.println("机构结算处理器");
    }

    @Override
    protected boolean isMatch(SettleContext settleContext) {
        if(settleContext.getFlag() == FlagEnum.BUSINESS){
            System.out.println("匹配机构");
            return true;
        }
        return false;
    }
}
