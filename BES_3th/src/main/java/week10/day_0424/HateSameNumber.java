package week10.day_0424;

import java.util.Stack;

public class HateSameNumber {

    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int n: arr) {
            if (stack.empty()) {
                stack.push(n);
            }
            if (stack.peek() != n) {
                stack.push(n);
            }
        }

        return stack.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }

}
