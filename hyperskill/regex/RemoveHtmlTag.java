// For a given string you should remove all HTML tags from it. An HTML tag starts with the symbol "<" and ends with the symbol ">".

// You should output the string without HTML tags.

import java.util.Scanner;

public class RemoveHtmlTag {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringWithHtmlTags = scanner.nextLine().trim();

        // write your code here
        stringWithHtmlTags = stringWithHtmlTags.replaceAll("(<.*?/>|<.*?>)", "");
        System.out.println(stringWithHtmlTags);
    }
}
