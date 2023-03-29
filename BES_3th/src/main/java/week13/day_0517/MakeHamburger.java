package week13.day_0517;

import java.util.Stack;

public class MakeHamburger {

    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> bugger = new Stack<>();

        for (int n : ingredient) {
            if (bugger.size() < 3) {
                bugger.push(n);
                continue;
            }

            if (n == 1 && isSuccessfulMake(bugger)) {
                answer++;
                bugger.pop();
                bugger.pop();
                bugger.pop();
                continue;
            }
            bugger.push(n);
        }

        return answer;
    }

    private boolean isSuccessfulMake(Stack<Integer> bugger) {
        int size = bugger.size();
        return bugger.get(size-1) == 3 && bugger.get(size-2) == 2 && bugger.get(size-3) == 1;
    }

}
