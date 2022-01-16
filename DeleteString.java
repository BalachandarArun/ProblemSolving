package StringProblem;

import java.util.Scanner;

public class DeleteString
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int postion = scanner.nextInt();
        input = input.substring(0, postion-1)+input.substring(postion);
        System.out.println(input);
        scanner.close();
    }
}
