package com.example.my2020.java8;

import com.google.common.collect.Sets;

import java.util.Set;

public class TestJava8 {
    public static void main(String[] args) {
//        List<String> list = Lists.newArrayList();
//        list.add("123");

//        List<String> list2 = Lists.newArrayList();
//        list2.add("456");

//        list.addAll(null);
//
//        list.forEach(System.out::println);

//        list.add(null);
//        list.add(null);
//        System.out.println(list.size());
//        list = list.stream().filter(e->e!=null).distinct().collect(Collectors.toList());
//        System.out.println(list.size());

        String str1 = "66,67,70,71,72,73,74,78,79,80,82,83,84,85,87,88,89,90,91,92,93,94,95,96,97,99,101,103,105,107,109,111,113,115,117,119,121,123,125,127,129,137,139,141,143,145,151,153,155,157,161,202,208,209,210,213,215,218,219,220,223,224,225,227,229,231,233,234,235,236,237,241,244,250,252,253,254,257,264,265,266,268,273,275,277,280,282,285,289,292,293,295,302,305,306,310,312,313,314,322,323,329,330,331,332,333,335,341,342,348,349,350,355,362,367,368,370,371,375,377,380,382,383,385,387,388,392,394,395,396,403,407,413,417,423,428,433,435,437,442,446,450,451,453,455,456,459,463,464,465,466,467,468,470,472,475,477,481,483,484,486,487,489,490,491,492,496,497,498,504,507,508,510,512,516,518,520,522,524,526";
String str2 = "66,67,70,71,72,73,74,78,79,80,82,83,84,85,87,88,89,90,91,92,93,94,95,96,97,99,101,103,105,107,109,111,113,115,117,119,121,123,125,127,129,137,139,141,143,145,151,153,155,157,202,208,213,218,219,220,223,224,227,229,231,233,234,235,236,237,241,250,252,253,254,257,264,265,266,268,273,277,280,282,285,289,292,293,295,302,305,306,310,312,313,314,322,323,329,330,331,332,333,335,341,342,348,349,350,355,362,367,368,370,371,375,377,380,382,383,385,387,388,392,394,395,396,407,417,423,428,433,435,437,442,446,450,451,453,455,456,459,463,464,465,466,467,468,470,472,475,477,481,483,484,486,487,489,490,491,492,496,497,498,507,508,512,516,518,520,522,524,526";
Set<String> set1 = Sets.newHashSet();
for(String str:str1.split(",")){
    set1.add(str);
}

        Set<String> set2 = Sets.newHashSet();
        for(String str:str2.split(",")){
            set2.add(str);
        }
        System.out.println(Sets.difference(set1,set2));
    }
}
