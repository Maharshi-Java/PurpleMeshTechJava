package com.PurpleMesh.DataStructurePrograms;

import com.PurpleMesh.Utility.Utility;

public class StackParenthesesMain {

    public static void main(String[] args) {
        System.out.println("Enter an arithmetic expression:");
        String expression = Utility.getNextLine();  

        boolean isBalanced = checkBalancedParentheses(expression);

        System.out.println("Is the expression balanced? " + isBalanced);
    }

    public static boolean checkBalancedParentheses(String expr) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty(); 
    }
}
