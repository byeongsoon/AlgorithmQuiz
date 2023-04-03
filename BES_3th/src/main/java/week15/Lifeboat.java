package week15;

import java.util.*;

public class Lifeboat {

    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        List<Integer> list = new ArrayList<>();

        for (int n : people) {
            list.add(n);
        }
        Deque<Integer> deque = new ArrayDeque<>(list);

        while (!deque.isEmpty()) {
            if ((deque.peekFirst() + deque.peekLast()) <= limit) {
                deque.pollFirst();
                deque.pollLast();
                answer++;
            } else {
                deque.pollLast();
                answer++;
            }
        }

        return answer;
    }

}
