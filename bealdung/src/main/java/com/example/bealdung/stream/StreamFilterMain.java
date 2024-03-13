package com.example.bealdung.stream;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterMain {

    public static void main(String[] args) {
        Customer john = new Customer("John P.", 15);
        Customer sarah = new Customer("Sarah M.", 200);
        Customer charles = new Customer("Charles B.", 150);
        Customer mary = new Customer("Mary T.", 1);

        List<Customer> customers = Arrays.asList(john, sarah, charles, mary);


        // filter collections
        List<Customer> customersWithMoreThan100Points = customers
                .stream()
                .filter(c -> c.getPoints() > 100)
                .collect(Collectors.toList());
        List<Customer> charlesWithMoreThan100Points = customers
                .stream()
                .filter(c -> c.getName().equals("Charles") && c.getPoints() > 100)
                .collect(Collectors.toList());


        // catching exception
        List<Customer> customersWithValidProfilePhoto = customers
                .stream()
                .filter( c -> {
                    try {
                        return c.hasValidProfilePhoto();
                    } catch(IOException e) {
                        e.printStackTrace();
                        return false;
                    }
                })
                .collect(Collectors.toList());
    }
}
