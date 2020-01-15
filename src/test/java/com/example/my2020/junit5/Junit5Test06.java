package com.example.my2020.junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class Junit5Test06 {
    @DisplayName("重复测试")
    @RepeatedTest(value = 3,name = "{displayName}第{currentRepetition}次")
    public void junit5Test05(){
        System.out.println("重复测试执行体");
    }
}
