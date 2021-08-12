package com.comfirstdemo.MyTest;

import org.junit.Test;
import org.junit.platform.commons.function.Try;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaTest {
    @Test
    public void lambdatest01() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 0);  //相当于new ArrayList<>然后将后面的1，2,3,4,5,0添加到集合中
        //Integer[] integers = list.toArray(new Integer[6]);
        //System.out.println(Arrays.toString(integers));
        list.forEach(i -> {
            try {
                System.out.println(50 / i);
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException:" + e.getMessage());
            }
        });
    }
}