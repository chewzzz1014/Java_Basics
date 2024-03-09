package com.example.bealdung.array;

import java.util.Arrays;

public class InitializeArray {

    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = {1,2,3,4,5};
        String[] arr3 = new String[] {"Toyota", "Mercedes", "BMW", "Volkswagen", "Skoda" };

        // fill arr w/ same value
        Arrays.fill(arr1, 0, 3, -5);

        // create a new copy: array, length
        int[] arr1Copy = Arrays.copyOf(arr1, 5);

        // set all elements using generator
        int[] arr4 = new int[20];
        Arrays.setAll(arr4, idx -> idx>9 ? 0 : idx);
    }
}
