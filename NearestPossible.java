package solution;

import java.util.Scanner;

public class NearestPossible
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        int Min;
        int res = num % num2;
        if (res == 0)
        {
            Min = num - num2;
        }
        else
        {
            int v1 = num - res;
            int v2 = (num - res) + num2;
            Min = Math.abs(num - v1) < Math.abs(num - v2) ? v1 : v2;
        }
        System.out.println(Min);

    }
}
