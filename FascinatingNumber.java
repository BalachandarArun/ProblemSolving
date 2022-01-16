package StringProblem;

import java.util.Scanner;

public class FascinatingNumber
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().trim();
        input += (Integer.parseInt(input)*2) + "" + (Integer.parseInt(input)*3);
        boolean flag = true;
        if (input.length() == 9)
        {
            for (char i = '1'; i <= '9'; i++) {
                if (!input.contains(i + "")) {
                    flag = false;
                    break;
                }
            }
        }
        else
            flag = false;

        if (flag)
            System.out.println("Given String is fascinating");
        else
            System.out.println("Given String is not fascinating");
        scan.close();

    }
}
