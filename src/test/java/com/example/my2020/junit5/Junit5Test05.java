package com.example.my2020.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class Junit5Test05 {
    @DisplayName("断言分组")
    @Test
    public void junit5Test05(){
        int[] numbers = {0,1,2,3,4,5};
        Assertions.assertAll("numbers",()->Assertions.assertEquals(numbers[0],0),
                ()->Assertions.assertEquals(numbers[1],2));
    }
}
