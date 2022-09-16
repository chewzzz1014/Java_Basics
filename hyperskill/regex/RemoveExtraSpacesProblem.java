// Write a program that reads a text and removes all extra spaces. The program must replace all repeating spaces and tabulations between words with a single space character (' ').

// Use the provided template. Please, use regular expressions to solve the task. 

import java.util.Scanner;

class RemoveExtraSpacesProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().trim();

        // write your code here
        text = text.replaceAll("\\s{2,}", " ");
        System.out.println(text);
    }
}
