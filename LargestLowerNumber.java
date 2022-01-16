package StringProblem;

import java.util.Scanner;

public class LargestLowerNumber
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = Integer.parseInt(scan.nextLine().trim());
        char c = Integer.toString(s).charAt(0);
        while (Integer.toString(s).contains(c+""))
        {
            s--;
        }
        System.out.println(s);
    }
}


