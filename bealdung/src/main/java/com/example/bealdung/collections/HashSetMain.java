package com.example.bealdung.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMain {

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        // add element
        hashSet.add("A");
        hashSet.add("ABCCCC");
        hashSet.add("Hello World");
        hashSet.add("jkddkdd");

        // remove
        hashSet.remove("jkddkdd");

        // size
        System.out.println(hashSet.size());

        // iterator
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        // contains
        System.out.println(hashSet.contains("A"));

        // clear
        hashSet.clear();

        // isEmpty
        System.out.println(hashSet.isEmpty());
    }
}
