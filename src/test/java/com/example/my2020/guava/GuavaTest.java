package com.example.my2020.guava;

import com.google.common.collect.Sets;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;

@DisplayName("测试guava")
public class GuavaTest {

    @Test
    @DisplayName("测试set集合的交集")
    public void test1(){
        Set<Integer> set1 = Sets.newHashSet();
        set1.add(1);
        set1.add(2);

        Set<Integer> set2 = Sets.newHashSet();
        set2.add(2);
        set2.add(3);
        System.out.println("set1有set2没有,"+Sets.difference(set1,set2));
        System.out.println("set2有set1没有,"+Sets.difference(set2,set1));
        System.out.println("set1和set2交集,"+Sets.intersection(set1,set2));

    }

}
