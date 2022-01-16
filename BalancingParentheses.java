package task;

import java.util.Stack;

public class BalancingParentheses
{

    public static boolean CheckBalance(String input)
    {
        Stack<Character> stack = new Stack<>();
        int flag = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            }
            else if (ch == '}' || ch == ']' || ch == ')')
            {
                if (!stack.isEmpty()) {
                    char popped = stack.pop();
                    if (!((popped == '{' && ch == '}') || (popped == '[' && ch == ']') || (popped == '(' && ch == ')'))) {
                        flag = 1;
                        break;
                    }
                }
                else {
                    flag = 1;
                    break;
                }
            }
        }
        return stack.isEmpty() && flag != 1;
    }

    public static void main(String[] args)
    {
        System.out.println(CheckBalance("{}()"));
        System.out.println(CheckBalance("({(a+b)*c}/45)"));
        System.out.println(CheckBalance("{}("));
        System.out.println(CheckBalance("[]"));
        System.out.println(CheckBalance("[{({}{}())}]"));


    }
}


/*

{}()
({()})
{}(
[]

switch (popped)
                    {
                        case '{':
                            if (ch == '}')
                                continue;
                            else
                                flag = 1;
                            break;
                        case '(':
                            if (ch == ')')
                                continue;
                            else
                                flag = 1;
                            break;
                        case '[':
                            if (ch == ']')
                                continue;
                            else
                                flag = 1;
                            break;
                    }
* */