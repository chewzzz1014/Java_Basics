package com.example.bealdung.collections;

import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();


        // add element
        list1.add(2);
        list1.addFirst(1);
        list1.addLast(3);


        // remove element
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.addAll(
                IntStream.range(0, 10)
                        .boxed()
                        .collect(Collectors.toList())
        );
        list2.removeFirst();
        list2.removeLast();


        // queue operations
        list1.poll(); // get 1st ele
        list1.pop(); // get last ele
        list1.push(5);

        System.out.println(list1);
    }
}
