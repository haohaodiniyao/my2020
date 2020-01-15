package com.example.my2020.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class Junit5Test02 {
    @DisplayName("基础数据源")
    @ParameterizedTest
    @ValueSource(ints = {2,4,7})
    public void junit5Test02(int num){
        Assertions.assertEquals(0,num%2);
    }
}
