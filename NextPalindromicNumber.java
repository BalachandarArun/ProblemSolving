package task;

import java.util.*;

public class NextPalindromicNumber
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
//        1 5 1 -> 151, 151
        ArrayList<Integer> list, list2;
        System.out.print("Enter a number : ");
        int num = scan.nextInt()+1;
        int temp, count = 0;
        System.out.print("The next three palindromic number is : ");
        while (count < 3) {
            temp = num;
            list = new ArrayList<>();
            while (temp > 0) {
                list.add(temp%10);
                temp = temp/10;
            }
            list2 = new ArrayList<>(list);
            Collections.reverse(list2);
            if (list.equals(list2)) {
                System.out.print(num+" ");
                count++;
            }
            num++;
        }
        System.out.println();
    }
}
// 151 151