package com.example.my2020.junit5;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("禁用执行测试")
public class Junit5Test08 {
    @Nested
    @DisplayName("禁用执行测试1")
    class FirstNestedTest{
        @Test
        void test(){
            System.out.println("禁用执行测试1");
        }
    }

    @Disabled
    @Nested
    @DisplayName("禁用执行测试2")
    class SecondNestedTest{
        @Test
        void test(){
            System.out.println("禁用执行测试2");
        }
    }
}
