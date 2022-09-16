// You are given a line of Java code. The author of the code tried to be a good programmer and left a lot of comments. Now, however, someone wants to actually understand how this code works, but these comments happen to be pretty uninformative and describe obvious things. Also, they slow down the process of code reading.

// Your task is to delete all these ugly useless comments from the code.

// The programmer wrote "/* this type of comments */" as well as "// this type of comments".

import java.util.Scanner;

public class RemoveComments {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String codeWithComments = scanner.nextLine();

        // write your code here
        codeWithComments = codeWithComments.replaceAll("(/\\*.*?\\*/|//.*)", "");
        System.out.println(codeWithComments);
    }
}
