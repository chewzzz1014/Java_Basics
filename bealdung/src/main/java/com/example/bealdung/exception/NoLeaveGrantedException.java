package com.example.bealdung.exception;

public class NoLeaveGrantedException extends Exception{

    public NoLeaveGrantedException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoLeaveGrantedException(String message) {
        super(message);
    }
}
