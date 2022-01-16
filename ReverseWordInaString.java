package StringProblem;

import java.util.Scanner;

public class ReverseWordInaString
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        String output = "";
        String temp = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ')
            {
                output += temp+" ";
                temp ="";
            }
            else
            {
                temp = input.charAt(i) + temp;
                if (i == input.length()-1)
                    output += temp;
            }
        }
        System.out.println(output);
        scanner.close();
    }
}
