package etc.ESTsoft;

import java.util.*;

public class Number2 {

    public int[] solution(int[] queue) {
        int[] answer = new int[3];
        Queue<Integer> _queue = new LinkedList<>();
        Map<Integer, Integer> elementCount = new HashMap<>();

        for (int i = 1; i <= answer.length; i++) {
            elementCount.put(i, 0);
        }

        for (int n : queue) {
            _queue.add(n);
            elementCount.put(n, elementCount.get(n) + 1);
        }

        List<Integer> keySet = new ArrayList<>(elementCount.keySet());

        while (!isSameEachElementCount(elementCount)) {
            keySet.sort(Comparator.comparing(elementCount::get));

            int element = keySet.get(0);
            int removeElement = _queue.poll();
            _queue.add(element);

            elementCount.put(element, elementCount.get(element) + 1);
            elementCount.put(removeElement, elementCount.get(removeElement) - 1);

            answer[element - 1]++;
        }

        return answer;
    }

    private boolean isSameEachElementCount(final Map<Integer, Integer> elementCount) {
        int oneCount = elementCount.get(1);
        int twoCount = elementCount.get(2);
        int threeCount = elementCount.get(3);

        return oneCount == twoCount && twoCount == threeCount;
    }

}
