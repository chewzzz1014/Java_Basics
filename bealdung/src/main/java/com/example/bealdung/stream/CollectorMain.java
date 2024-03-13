package com.example.bealdung.stream;

import com.google.common.collect.ImmutableList;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorMain {

    public static void main(String[] args) {
        List<String> givenList = Arrays.asList("a", "bb", "ccc", "dd");

        // stream -> List
        List<String> result = givenList
                .stream()
                .collect(Collectors.toList());
        // stream -> unmodifiable list
        List<String> result1 = givenList
                .stream()
                .collect(Collectors.toUnmodifiableList());


        // stream -> set
        Set<String> result2 = givenList
                .stream()
                .collect(Collectors.toSet());
        // stream -> unmodifiable set
        Set<String> result3 = givenList
                .stream()
                .collect(Collectors.toUnmodifiableSet());


        // stream -> collection (can use custom implementation)
        List<String> result4 = givenList
                .stream()
                .collect(Collectors.toCollection(LinkedList::new));


        // stream -> map
        Map<String, Integer> result5 = givenList
                .stream()
                .collect(Collectors.toMap(Function.identity(), String::length));
        Map<String, Integer> result6 = givenList
                .stream()
                .collect(Collectors.toMap(
                        Function.identity(),
                        String::length,
                        (item, identicalItem) -> item // BinaryOperator: specify how collision to be handled
                ));
        // stream -> unmodifiable map
        Map<String, Integer> result7 = givenList
                .stream()
                .collect(Collectors.toUnmodifiableMap(Function.identity(), String::length));


        // collectingAndThen
        List<String> result8 = givenList
                .stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(), // execute first
                         ImmutableList::copyOf// execute then, convert result into immutablelist instance
                ));


        // joining
        String result9 = givenList.stream().collect(Collectors.joining(" ", "PRE-", "-POST"));


        // counting
        Long result10 = givenList.stream().collect(Collectors.counting());


        // summarizingDouble/Long/Int -> return statistical info
        DoubleSummaryStatistics result11 = givenList
                .stream()
                .collect(Collectors.summarizingDouble(String::length));
        System.out.println(result11);


        // averagingDouble/Long/Int
        Double result12 = givenList
                .stream()
                .collect(Collectors.averagingDouble(String::length));


        // summingDouble/Long/Int()
        Double result13 = givenList
                .stream()
                .collect(Collectors.summingDouble(String::length));


        // maxBy, minBy (return Min/Max)
        Optional<String> result14 = givenList
                .stream()
                .collect(Collectors.maxBy(Comparator.naturalOrder()));


        // groupingBy
        Map<Integer, Set<String>> result15 = givenList
                .stream()
                .collect(Collectors.groupingBy(String::length, Collectors.toSet()));


        // partitioningBy: partition into map, "true" key holds the collection of element matching the given predicate, or vice verse.
        Map<Boolean, List<String>> result16 = givenList
                .stream()
                .collect(Collectors.partitioningBy(s -> s.length() > 2));


        // teeing: tees the given stream towards 2 diff directions
        List<Integer> numbers = Arrays.asList(42, 4, 2, 24);
        Optional<Integer> min = numbers.stream().collect(
                Collectors.teeing(
                        Collectors.minBy(Integer::compareTo),
                        Collectors.minBy(Integer::compareTo),
                        (minVal, maxVal) -> minVal
                )
        );




    }
}
