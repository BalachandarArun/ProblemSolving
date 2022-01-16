package task;

import java.util.Scanner;

public class NextThreePrimeNumber
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number : ");
//        11 13 17 19
        int num = scanner.nextInt()+1;
        int count = 0;
        System.out.print("The next three prime number is : ");
        while (count < 3) {
            if (num == 0 || num == 1) {
                num++;
                continue;
            }
            else {
                int flag = 0;
                for (int i = 2; i < num; i++) {
                    if (num%i == 0) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.print(num+" ");
                    count++;
                }
            }
            num++;
        }
    }
}
