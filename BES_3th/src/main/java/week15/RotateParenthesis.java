package week15;

import java.util.Stack;

public class RotateParenthesis {

    public int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            if (isCorrectParentheses(s)) {
                answer++;
            }
            s = rotate(s);
        }

        return answer;
    }

    private boolean isCorrectParentheses(String parentheses) {
        Stack<Character> stack = new Stack<>();
        for (char ch : parentheses.toCharArray()) {
            if ('(' == ch || '[' == ch || '{' == ch) {
                stack.push(ch);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }

            if (')' == ch && '(' == stack.peek()) {
                stack.pop();
            } else if ('}' == ch && '{' == stack.peek()) {
                stack.pop();
            } else if (']' == ch && '[' == stack.peek()) {
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    private String rotate(String s) {
        char end = s.charAt(0);
        return s.substring(1) + end;
    }

    public static void main(String[] args) {
        String s = "[](){}";
        RotateParenthesis test = new RotateParenthesis();
        System.out.println(test.rotate(s));

        System.out.println(test.isCorrectParentheses(test.rotate(s)));
    }

}
