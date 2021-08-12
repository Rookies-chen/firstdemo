package com.comfirstdemo.MyTest;

import org.junit.Test;

import java.util.*;
import java.util.stream.Stream;

public class streamTest {
    @Test
    public void streamTest01(){
        List<Integer> integersList = Arrays.asList(2,2,5,1,8,0,5);

        //过滤+lambda表达式
        Stream<Integer> integerStream = integersList.stream().filter(i -> i >= 1 && i <= 5);
        integerStream.forEach(System.out::println);

        System.out.println();
        //去重
        Stream<Integer> integerStream1 = integersList.stream().distinct();
        integerStream1.forEach(System.out::println);
        System.out.println();
//        List<String> stringList = Arrays.asList("李白","韩信","鲁班","赵云","韩信");
//        Stream<String> stringStream = stringList.stream().distinct();
//        stringStream.forEach(System.out::println);
        List<Map<String,Integer>> mapList = Arrays.asList();
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("k1",1);
        map1.put("k2",2);
        map1.put("k3",3);
        Map<String,Integer> map2 = new HashMap<>();
        map2.put("k1",1);
        map2.put("k2",2);
        map2.put("k3",3);
        Map<String,Integer> map3 = new HashMap<>();
        map3.put("k1",1);
        map3.put("k2",2);
        map3.put("k3",3);
        mapList.add(map1);
        mapList.add(map2);
        mapList.add(map3);

    }
}
