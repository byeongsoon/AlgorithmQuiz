package etc.level3;

import java.util.Collections;
import java.util.PriorityQueue;

public class DoublePriorityQueue {

    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> asc = new PriorityQueue<>();
        PriorityQueue<Integer> desc = new PriorityQueue<>(Collections.reverseOrder());

        for(String operation : operations) {
            String[] split = operation.split(" ");
            String op = split[0];
            int number = Integer.parseInt(split[1]);

            if ("I".equals(op)) {
                asc.add(number);
                desc.add(number);
                continue;
            }

            Integer target = 0;
            if (number > 0) {
                target = desc.poll();
                asc.remove(target);
            } else {
                target = asc.poll();
                desc.remove(target);
            }
        }
        if (desc.isEmpty()) {
            return answer;
        }

        answer[0] = desc.peek();
        answer[1] = asc.peek();
        return answer;
    }

}
