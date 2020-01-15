package com.example.my2020.junit5;

import org.junit.jupiter.api.*;

@DisplayName("第1个Junit5测试类")
public class Junit5Test09 {
    @BeforeAll
    public static void beforeAll(){
        System.out.println("BeforeAll");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("AfterAll");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("BeforeEach");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("AfterEach");
    }
    @DisplayName("第1个测试用例")
    @Test
    public void test1(){
        System.out.println("第1个测试用例");
    }
    @DisplayName("第2个测试用例")
    @Test
    public void test2(){
        System.out.println("第2个测试用例");
    }
}
