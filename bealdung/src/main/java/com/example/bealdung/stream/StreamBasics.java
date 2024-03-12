package com.example.bealdung.stream;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasics {

    public static void main(String[] args) {
        String[] arr = new String[]{"a", "b", "c"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList("One", "OneAndOnly", "Derek", "Change", "factory", "justBefore", "Italy", "Italy", "Thursday", "", ""));

        // convert list to stream
        Stream<String> stream = Arrays.stream(arr);
        // stream = Stream.of("a", "b", "c");


        // intermediate operations, distinct() & terminal operations, count()
        long count = stream.distinct().count();


        // iteration
        for(String string : arr) {
            if(string.contains("a")) {
                System.out.println(string);
            }
        }
        // can be represented in the form of
        boolean isExist = stream.anyMatch(ele -> ele.contains("a"));


        // filter
        Stream<String> filteredStream = list.stream().filter(ele -> ele.contains("d"));


        // map
        Stream<String> mappedStream = list.stream().map(ele -> "I'm " + ele);
        List<String> uris = Arrays.asList("C:\\My.txt");
        Stream<Path> paths = uris.stream().map(Paths::get);


        // matching: anyMatch, allMatch, noneMatch
        boolean isValid = list.stream().anyMatch(ele -> ele.contains("h"));
        boolean isValid1 = list.stream().allMatch(ele -> ele.contains("h"));
        boolean isValid2 = list.stream().noneMatch(ele -> ele.contains("h"));


        // reduction
        List<Integer> integers = Arrays.asList(1,1,1);
        Integer reduced = integers.stream().reduce(23, (a, b) -> a + b);


        // collect
        List<String> capitalisedList = list.stream()
                .map(ele -> ele.toUpperCase())
                .collect(Collectors.toList());

    }
}
