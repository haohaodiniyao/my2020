package com.example.my2020.design.model;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

@DisplayName("结算测试")
public class SettleExecutorTest {
    private static List<AbstractSettleExecutor> settleExecutorList = Lists.newArrayList();
    @BeforeAll
    public static void initSettleExecutor(){
        settleExecutorList.add(new CustomerSettleExecutor());
        settleExecutorList.add(new BusinessSettleExecutor());
    }
    @Test
    public void test(){
        FlagEnum flagEnum = FlagEnum.getByCode(3);
        SettleContext settleContext = SettleContext.builder().flag(flagEnum).build();
        boolean match = false;
        for(AbstractSettleExecutor settleExecutor:settleExecutorList){
            if(settleExecutor.isMatch(settleContext)){
                match = true;
                settleExecutor.execute();
                break;
            }
        }
        if(!match){
            System.out.println("没有匹配到执行器");
        }
    }

}
