package com.example.bealdung.collections;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapMain2 {

    public static Map<String, String> articleMapOne;
    static {
        articleMapOne = new HashMap<>();
        articleMapOne.put("ar01", "Intro to Map");
        articleMapOne.put("ar02", "Some article");
    }

    public static Map<String, String> createSingletonMap() {
        return Collections.singletonMap("username1", "password");
    }

    public static void main(String[] args) {
        Map<String, String> map = Stream.of(new String[][] {
                {"Hello", "World"},
                {"John", "Doe"},
        }).collect(Collectors.toMap(data -> data[0], data -> data[1]));

        Map<String, Integer> map1 = Stream.of(new Object[][] {
            {"data1", 1},
            {"data2", 2},
        }).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));

        Map<String, Integer> map2 = Stream.of(
                new AbstractMap.SimpleEntry<>("idea", 1),
                new AbstractMap.SimpleEntry<>("mobile", 2)
        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        Map<String, String> map3 = Map.ofEntries(
          new AbstractMap.SimpleEntry<String, String>("name", "John"),
          new AbstractMap.SimpleEntry<String, String>("city", "budapest"),
          new AbstractMap.SimpleEntry<String, String>("zip", "000000"),
          new AbstractMap.SimpleEntry<String, String>("home", "1231231231")
        );
    }
}
