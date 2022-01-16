package StringProblem;

import java.util.Scanner;

public class DigitReplacer
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        System.out.println(String.valueOf(val).replace('0','5'));
    }
}
