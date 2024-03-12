package com.example.bealdung.collections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ArrayListMain {

    public static void main(String[] args) {
        // initial capacity: 20
        List<String> list1 = new ArrayList<>(20);
        List<Long> list2 = new ArrayList<>();


        // collection to list
        Collection<Integer> collection1 = IntStream.range(0, 10).boxed().collect(Collectors.toSet());
        List<Integer> list3 = new ArrayList<>(collection1);


        // add element
        list2.add(1L);
        list2.add(2L);
        list2.add(1, 3L); // add at index 1


        // iterate: Iterator (one direction) and ListIterator (both direction)
        List<Integer> list4 = new ArrayList<>(
          IntStream.range(0, 10).boxed().collect(Collectors.toCollection(ArrayList::new))
        );
        ListIterator<Integer> listIterator = list4.listIterator(list4.size());
        List<Integer> result1 = new ArrayList<>(list4.size());
        while(listIterator.hasPrevious()) {
            result1.add(listIterator.previous());
        }
        Collections.reverse(list4);


        // search unsorted list
        // 1. indexOf, lastIndexOf
        List<String> list5 = LongStream.range(0, 16)
                .boxed()
                .map(Long::toHexString)
                .collect(Collectors.toCollection(ArrayList::new));
        List<String> result2 = new ArrayList<>(list5);
        result2.addAll(list5);
        System.out.println("Index of 'a': " + result2.indexOf("a"));
        System.out.println("Last index of 'a': " + result2.lastIndexOf("a"));

        // 2. filter collection (stream)
        Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "9"));
        List<String> result3 = result2
                .stream()
                .filter(set1::contains)
                .collect(Collectors.toCollection(ArrayList::new));

        // 3. for loop or iterator
        IteratorMain<String> iterator = result2.iterator();
        List<String> result4 = new ArrayList<>();
        while(iterator.hasNext()) {
            String s = iterator.next();
            if (set1.contains(s)) result4.add(s);
        }


        // search sorted list (binary search)
        List<String> copy = new ArrayList<>(result2);
        Collections.sort(copy);
        int index = Collections.binarySearch(copy, "f");


        // remove element
        List<Integer> list6 = new ArrayList<>(
          IntStream.range(0, 10).boxed().collect(Collectors.toCollection(ArrayList::new))
        );
        Collections.reverse(list6);
        list6.remove(0);
        list6.remove(Integer.valueOf(0));

    }
}
