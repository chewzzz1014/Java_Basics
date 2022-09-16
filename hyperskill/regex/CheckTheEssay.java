// You have been asked to read and check a student's essay about the Eiffel Tower. You've noticed some recurring spelling errors and decided to write a program to correct these mistakes throughout the whole text.

// Your program should make all of the following changes (in any context):

//     Franse —> France
//     Eifel tower —> Eiffel Tower
//     19th —> XIXth
//     20th —> XXth
//     21st —> XXIst


import java.util.Scanner;


class CheckTheEssay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        // write your code here
        text = text.replaceAll("Eifel tower", "Eiffel Tower");
        text = text.replaceAll("Franse", "France");
        text = text.replaceAll("19th", "XIXth");
        text = text.replaceAll("20th", "XXth");
        text = text.replaceAll("21st", "XXIst");
        System.out.println(text);
    }
}
