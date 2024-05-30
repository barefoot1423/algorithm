package com.hyunwoo.leetCode.interview150.p20;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        char[] sCharArray = s.toCharArray();
        for (int i = 0; i < sCharArray.length; i++) {
            if (sCharArray[i] == '(' || sCharArray[i] == '{' || sCharArray[i] == '[') {
                stack.add(sCharArray[i]);
            } else {
                if (!stack.isEmpty()) {
                    if (sCharArray[i] == ')') {
                        if (stack.pop() != '(') {
                            return false;
                        }
                    } else if (sCharArray[i] == '}') {
                        if (stack.pop() != '{') {
                            return false;
                        }
                    } else {
                        if (stack.pop() != '[') {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

}
