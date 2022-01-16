package StringProblem;

import java.util.Scanner;

public class FirstNonRepeating
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        String temp = input.toLowerCase();
        boolean flag = true;
        for (int i = 0; i < input.length(); i++) {
            if (temp.indexOf(temp.charAt(i)) == temp.lastIndexOf(temp.charAt(i))) {
                System.out.println(input.charAt(i));
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println("No occurrence found");
        scanner.close();
    }
}
