package datastructures;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    Stack<String> stack = new Stack<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            BalancedBrackets balancedBrackets = new BalancedBrackets();
            System.out.println(balancedBrackets.execute(s));
        }
    }

    String execute(String input) {
        String[] brackets = input.split("");
        for (String bracket : brackets) {
            switch (bracket) {
                case "(":
                case "{":
                case "[":
                    stack.push(bracket);
                    break;
                case ")":
                case "}":
                case "]":
                    if (stack.isEmpty())
                        return "NO";
                    if (!stack.isEmpty())
                        if (!match(stack.pop(), bracket))
                            return "NO";

            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }

    private boolean match(String open, String closed) {
        switch (open) {
            case "(":
                return ")".equalsIgnoreCase(closed);
            case "{":
                return "}".equalsIgnoreCase(closed);
            case "[":
                return "]".equalsIgnoreCase(closed);
        }
        return false;
    }

}
