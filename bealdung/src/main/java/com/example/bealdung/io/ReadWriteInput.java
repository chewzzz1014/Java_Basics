package com.example.bealdung.io;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadWriteInput {

    public static void main(String[] args) throws IOException {
        // scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Full Name: ");
        String fullname = scanner.nextLine();

        System.out.print("\nGender: ");
        String gender = scanner.next();

        System.out.print("\nAge: ");
        int age = scanner.nextInt();

        System.out.print("\nHeight: ");
        double height = scanner.nextDouble();

        System.out.printf("\nName: %s\nGender: %s\nAge: %d\nHeight: %.2f", fullname, gender, age, height);


        // InputStreamReader
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\ni: ");
        int i = Integer.parseInt(bufferedReader.readLine());


        // console
        Console console = System.console();
        String progLanguage = console.readLine("Enter your favourite programming language: ");
        char[] pass = console.readPassword("To finish, enter password: ");
        console.printf("%s is very fun.", progLanguage);


    }
}
