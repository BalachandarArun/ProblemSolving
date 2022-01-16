package StringProblem;

import java.util.Scanner;

public class RotatedString
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
//        for (int i = 0; i < s1.length(); i++, gap++) {
//            if (s1.charAt(i) != s2.charAt(gap% s2.length()))
//                flag = false;
//        }
//        System.out.println(flag);

        /*char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        flag = false;

        for (int i = 0; i < s1.length(); i++) {
            char temp = ch1[0];
            for (int j = 0; j < ch1.length - 1; j++) {
                ch1[j] = ch1[j+1];
            }
            ch1[ch1.length-1] = temp;
            if (Arrays.equals(ch1, ch2))
                flag = true;
        }
        System.out.println(flag);
        System.out.println(s1.substring(2).equals(s2.substring(0, 2)));*/

        System.out.println(s1.length()==s2.length() && (s1 + s1).contains(s2));
    }
}
