package com.example.bealdung.exception;

import java.io.IOException;

public class MyChainedException {

    public static void main(String[] args){
        try {
            throw new ArithmeticException("Top Level Execution")
                    .initCause(new IOException("IO cause."));
        } catch(ArithmeticException ae) {
            System.out.println("Caught: " + ae);
            System.out.println("Actual cause: " + ae.getCause());
        } catch(Throwable t) {
            System.out.println("Caught a Throwable: " + t);
        }
    }
}
