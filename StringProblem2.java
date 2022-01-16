package StringProblem;

import java.util.Scanner;

public class StringProblem2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        while (String.valueOf(val).contains("6")) {
            val--;
        }
        System.out.println(val);
    }
}
