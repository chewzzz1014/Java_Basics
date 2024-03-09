package com.example.bealdung.lambda;

import java.util.function.Function;

public class MainFoo {
    public static void main(String[] args) {
        Function<String, String> fn = param -> param + " from lambda";
        String result = add("Message ", fn);
    }

    public static String add(String string, Function<String, String> fn) {
        return fn.apply(string);
    }
}
