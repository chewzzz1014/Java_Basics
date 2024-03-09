package com.example.bealdung.record;

import java.util.Objects;

public record PersonRecord(String name, String address) {
    // static property
    public static String UNKNOWN_ADDRESS = "Unknown";

    // ensure that name and address are not null
    public PersonRecord {
        Objects.requireNonNull(name);
        Objects.requireNonNull(address);
    }

    // constructor
    public PersonRecord(String name) {
        this(name, "Unknown");
    }

    // static method
    public static PersonRecord unnamed(String name, String address) {
        return new PersonRecord("Unnamed", address);
    }
}