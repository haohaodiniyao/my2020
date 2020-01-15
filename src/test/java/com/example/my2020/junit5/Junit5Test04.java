package com.example.my2020.junit5;

import ch.qos.logback.core.util.TimeUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;

public class Junit5Test04 {
    @DisplayName("超时测试")
    @Test
    public void junit5Test04(){
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(1),()->{Thread.sleep(2000);});
    }
}
