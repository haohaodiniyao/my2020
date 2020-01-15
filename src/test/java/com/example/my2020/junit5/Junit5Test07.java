package com.example.my2020.junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("内嵌测试类")
public class Junit5Test07 {
    @Nested
    @DisplayName("第一个内嵌测试类")
    class FirstNestedTest{
        @Test
        void test(){
            System.out.println("第1个内嵌测试类执行体");
        }
    }

    @Nested
    @DisplayName("第二个内嵌测试类")
    class SecondNestedTest{
        @Test
        void test(){
            System.out.println("第2个内嵌测试类执行体");
        }
    }
}
