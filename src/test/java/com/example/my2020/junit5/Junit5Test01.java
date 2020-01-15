package com.example.my2020.junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Junit5Test01 {
    @DisplayName("CSV格式数据")
    @ParameterizedTest
    @CsvSource(value = {"1,one","2,two","3,three"},delimiter = ',')
    public void junit5Test01(Long id,String name){
        System.out.println(id+","+name);
    }
}
