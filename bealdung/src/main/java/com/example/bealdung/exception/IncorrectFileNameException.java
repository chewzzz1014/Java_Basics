package com.example.bealdung.exception;

public class IncorrectFileNameException extends Exception{

    public IncorrectFileNameException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
