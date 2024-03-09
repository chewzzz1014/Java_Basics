package com.example.bealdung.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ArrayMain {

    public static void main(String[] args) {
        Integer[] numArr = new Integer[5];
        int[] numArr1 = new int[] {1,2,3,4,5};
        int[] numArr2 = new int[] {34, 12, 44, 7, 0, 34, 68};
        String[] strArr = new String[] {"Milk", "Tomato", "Chips"};

        // iterate all elements
        for (int n:numArr1)
            System.out.println(n);

        // varargs
        VarargsMethod(strArr);

        // transform array -> list
        List<Integer> numList = Arrays.asList(numArr);

        // transform array -> Stream
        Stream<String> strStream = Arrays.stream(strArr);

        // sort array (in place):
        // 1. primitive type array
        // 2. Object array: Object must implements Comperable, override compareTo method
        // 3. generic array: sort according to Comparator
        Arrays.sort(numArr2);
        Arrays.sort(strArr, Comparator.comparing(String::toString).reversed());

        // merge array: source arr, source position, dest arr, dest positon, num of ele to copy
        System.arraycopy(numArr1, 0, numArr2, 0, numArr1.length);
    }

    // varargs: turn N number of args into an array
    static void VarargsMethod(String... varargs) {
        System.out.println(varargs[2]);
    }
}
