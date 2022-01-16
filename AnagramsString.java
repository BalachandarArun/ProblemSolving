package StringProblem;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramsString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine().trim();
        String s2 = scanner.nextLine().trim();
        char[] c1 = s1.replace(" ", "").toCharArray();
        char[] c2 = s2.replace(" ", "").toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println(c1.length == c2.length && Arrays.equals(c1, c2) ?
                        "Both Strings are anagram" :
                        "Given Strings are not an anagram");
    }
}

/*
*
        int count = 0;

        for (int i = 0; i < c1.length; i++) {
            if (c1[i].length() == c2[i].length()) {
                char[] p1 = c1[i].toCharArray();
                char[] p2 = c2[i].toCharArray();
                Arrays.sort(p1);
                Arrays.sort(p2);
                count = Arrays.equals(p1, p2) ? count+1 : count;
            }
        }
        * if (c1.length == c2.length)
        {
            Arrays.sort(c1);
            Arrays.sort(c2);
            System.out.println(Arrays.equals(c1, c2) ? "Both Strings are anagram" : "Given Strings are not an anagram");
        }
        else
        {
            System.out.println("Given Strings are not an anagram");
        }
* */