package StringProblem;

import java.util.Scanner;

public class StringDeletion
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine().trim();
        String s2 = scanner.nextLine().trim();
        String output = "";
        for (int i = 0; i < s1.length(); i++) {
            if (!s2.contains(String.valueOf(s1.charAt(i))))
            {
                output+=s1.charAt(i);
            }
        }
        System.out.println(output);
        scanner.close();
    }
}
