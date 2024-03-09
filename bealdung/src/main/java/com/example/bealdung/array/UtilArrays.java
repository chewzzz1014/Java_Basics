package com.example.bealdung.array;

import java.util.Arrays;

public class UtilArrays {

    public static void main(String[] args) {
        String[] arr1 = new String[] { "once", "upon", "a", "time" };

        // copyOf & copyOfRange
        String[] result1 = Arrays.copyOfRange(arr1, 0, 3);
        String[] result2 = Arrays.copyOfRange(arr1, 0, 3); // pads array with null if target.length < oriArr.length

        // equals (fails if there's null) & deepEquals (for multi-dimensional)
        System.out.println(Arrays.equals(new String[] { "once", "upon", "a", "time" }, arr1));

        // hashcode & deepHashCode
        int hashBefore = Arrays.hashCode(arr1);
        int deepHashBefore = Arrays.deepHashCode(arr1);
        arr1[3] = "the";
        int hashAfter = Arrays.deepHashCode(arr1);
        int deepHashAfter = Arrays.deepHashCode(arr1);
        System.out.printf("Hash before: %d\nHash after: %d\n", hashBefore, hashAfter);
        System.out.printf("Deep Hash before: %d\nDeep Hash after: %d\n", deepHashBefore, deepHashAfter);

        // toString: convert the arr to string
        System.out.println(Arrays.toString(arr1));

        // parallelPrefix: operate on each element of arr in cumulative fashion
        int[] result3 = {1,2,3,4};
        Arrays.parallelPrefix(result3, (left, right) -> left + right);
        System.out.println(Arrays.toString(result3)); // {1,3,6,10}
    }
}
