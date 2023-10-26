package etc.level2;

import java.util.PriorityQueue;

public class FindTheNextBigNumber {

    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> a[1] - b[1]);

        for (int i = 0; i < numbers.length; i++) {
            int value = numbers[i];

            while (!queue.isEmpty() && queue.peek()[1] < value) {
                answer[queue.poll()[0]] = value;
            }

            queue.add(new int[]{i, value});
        }

        while (!queue.isEmpty()) {
            answer[queue.poll()[0]] = -1;
        }

        return answer;
    }

}