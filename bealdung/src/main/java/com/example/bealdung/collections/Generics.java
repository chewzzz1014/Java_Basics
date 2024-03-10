package com.example.bealdung.collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Generics {

    public <T, G> List<G> fromArrayToList(T[] arr, Function<T, G> mapperFunction) {
        return Arrays.stream(arr)
                .map(mapperFunction)
                .collect(Collectors.toList());
    }

    // bounded generic: its subclass (upper bound) or superclass (lower bound)
    public static void paintAllBuildings(List<? extends Building> buildings) {
        buildings.forEach(Building::toString);
    }
}

class Building {

}
