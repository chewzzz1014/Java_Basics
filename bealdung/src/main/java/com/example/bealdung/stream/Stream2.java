package com.example.bealdung.stream;

import com.example.bealdung.collections.Product;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Stream2 {

    private static long counter;

    private static void wasCalled() {
        counter++;
    }

    public static void main(String[] args) throws IOException {
        // empty stream
        Stream<String> emptyStream = Stream.empty();

        // collection -> stream
        Collection<String> collection = Arrays.asList("a", "b", "c");
        Stream<String> streamOfCollection = collection.stream();

        // array -> stream
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> streamOfArrFull = Arrays.stream(arr);
        Stream<String> streamOfArrPartial = Arrays.stream(arr, 1, 3);


        // builder (specify the type after 'Stream.')
        Stream<String> streamBuilder = Stream.<String>builder()
                .add("a")
                .add("c")
                .build();


        // generate: accepts Supplier<T> for element generation
        // resulting stream is infinite, need to specify the desired size
        Stream<String> streamGenerated = Stream.generate(() -> "element").limit(10);


        // iterate
        Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);


        // stream of primitives
        IntStream intStream = IntStream.range(1, 3); // end exclusive
        LongStream longStream  = LongStream.rangeClosed(1, 3); // end inclusive


        // stream of string
        // char
        IntStream streamOfChars = "abc".chars();
        // string
        Stream<String> streamOfString = Pattern.compile(", ").splitAsStream("a, b, c");


        // stream of file
        Path path = Paths.get("C:\\file.txt");
        Stream<String> streamOfStrings = Files.lines(path);
        Stream<String> streamWithCharset = Files.lines(path, Charset.forName("UTF-8"));


        // stream can't be reused!
        List<String> elements = Stream.of("a", "b", "c")
                .filter(ele -> ele.contains("b"))
                .collect(Collectors.toList());


        // stream pipeline
        Stream<String> stream1 = Stream.of("abcd", "bbcd", "cbcd").skip(1);
        Stream<String> stream2 = stream1.map(ele -> ele.substring(0, 3));
        long size = stream2.sorted().count();


        // lazy invocation
        List<String> list = Arrays.asList("abc1", "abc2", "abc3");
        counter = 0;
        Optional<String> stream3 = list.stream().filter(ele -> {
            System.out.println("filter() was called");
            return ele.contains("2");
        }).map(ele -> {
            System.out.println("map() was called");
            return ele.toUpperCase();
        }).findFirst();
    }


    // convert list into stream
    public Stream<String> streamOf(List<String> list) {
        return list == null || list.isEmpty() ? Stream.empty() : list.stream();
    }


    // reduce
    OptionalInt reduced = IntStream.range(1, 4).reduce((a, b) -> a + b); // 0 (initial value) + 1 + 2 + 3
    int reducedTwoParams = IntStream.range(1, 4).reduce(10, (a, b) -> a + b); // 10 + 1 + 2 + 3
    int reducedParams = Arrays.asList(1, 2, 3)
            .parallelStream()
            .reduce(10, (a, b) -> a + b, (a, b) -> {
                //  combine function: aggregates the results of the accumulator
                //  only call combiner in a parallel mode to reduce the results of accumulators from different threads.
                System.out.println("combiner was called");
                return a+b;
            });



    // collect: accepts args of type Collector
    List<Product> productList = Arrays.asList(
            new Product(23, "potatoes"),
            new Product(14, "orange"),
            new Product(13, "lemon"),
            new Product(23, "bread"),
            new Product(13, "sugar")
    );
    // stream -> collection (collection/list/set)
    List<String> collectorCollection = productList
            .stream()
            .map(Product::getName)
            .collect(Collectors.toList());
    // stream -> string
    String listToString = productList
            .stream()
            .map(Product::getName)
            .collect(Collectors.joining(", ", "[", "]"));
    // get average value
    double avgPrice = productList
            .stream()
            .collect(Collectors.averagingInt(Product::getPrice));
    // get sum
    double sumPrice = productList
            .stream()
            .collect(Collectors.summingInt((Product::getPrice)));
    // statistical info
    IntSummaryStatistics statistics = productList.stream()
            .collect(Collectors.summarizingInt(Product::getPrice));
    // group by
    Map<Integer, List<Product>> collectorMapOfLists = productList.stream()
            .collect(Collectors.groupingBy(Product::getPrice));

    Map<Boolean, List<Product>> mapPartioned = productList.stream()
            .collect(Collectors.partitioningBy(element -> element.getPrice() > 15));
    Set<Product> unmodifiableSet = productList
            .stream()
            .collect(Collectors.collectingAndThen(Collectors.toSet(), Collections::unmodifiableSet));



}
