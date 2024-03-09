package com.example.bealdung.exception;

public class MyResource implements AutoCloseable{

    // for resources defined first within try-with block, it'll be closed last
    public static void main(String[] args) throws Exception{
        try (
                AutoCloseableResourcesFirst a1 = new AutoCloseableResourcesFirst();
                AutoCloseableResourcesSecond a2 = new AutoCloseableResourcesSecond();
        ) {
            a1.doSomething();
            a2.doSomething();
        }
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closed MyResource");
    }
}
