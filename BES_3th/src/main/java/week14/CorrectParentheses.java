package week14;

import java.util.Stack;

public class CorrectParentheses {

    public boolean solution(String s) {
        Stack<Character> parentheses = new Stack<>();

        for (char ch : s.toCharArray()) {
            if ('(' == ch) {
                parentheses.push(ch);
                continue;
            }
            if (parentheses.empty()) {
                return false;
            }
            parentheses.pop();
        }

        return parentheses.empty();
    }

}
