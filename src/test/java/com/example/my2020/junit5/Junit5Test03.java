package com.example.my2020.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Junit5Test03 {
    @DisplayName("异常测试")
    @Test
    public void junit5Test03(){
        String str = null;
        Assertions.assertThrows(IllegalArgumentException.class,()->{
//            Integer.valueOf(str);
            int a = 1/0;
        });
    }
}
