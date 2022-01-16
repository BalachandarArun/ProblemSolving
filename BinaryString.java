package StringProblem;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BinaryString
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().trim();
        List<String> list = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0')
                continue;
            String s2 = String.valueOf(str.charAt(i));
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(j) == '1') {
                    s2+=str.charAt(j);
                    list.add(s2);
                }
                else {
                    s2+=str.charAt(j);
                }
            }
        }
        list.forEach(e-> System.out.print(e+"     "));
    }
}
