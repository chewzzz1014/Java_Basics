package com.example.bealdung.lambda;

@FunctionalInterface
public interface Foo {

    String method(String string);
    default void defaultMethod() {};
}
