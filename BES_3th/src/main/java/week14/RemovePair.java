package week14;

import java.util.Stack;

public class RemovePair {

    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (stack.empty()) {
                stack.push(ch);
                continue;
            }

            if (stack.get(stack.size()-1) == ch) {
                stack.pop();
                continue;
            }

            stack.push(ch);
        }

        return stack.empty() ? 1 : 0;
    }

}
