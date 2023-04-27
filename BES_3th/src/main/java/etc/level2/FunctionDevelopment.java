package etc.level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionDevelopment {

    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> progress = new ArrayList<>();
        List<Integer> speed = new ArrayList<>();

        for(int i = 0; i < progresses.length; i++) {
            progress.add(progresses[i]);
            speed.add(speeds[i]);
        }

        while(!progress.isEmpty()) {
            for(int i = 0; i < progress.size(); i++) {
                int element = progress.get(i);
                if (element >= 100) {
                    continue;
                }
                progress.remove(i);
                progress.add(i, element + speed.get(i));
            }

            if (progress.get(0) >= 100) {
                answer.add(getDeployCount(progress, speed));
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private int getDeployCount(List<Integer> progress, List<Integer> speed) {
        int count = 0;

        while (!progress.isEmpty() && progress.get(0) >= 100) {
            progress.remove(0);
            speed.remove(0);
            count++;
        }

        return count;
    }

    public int[] otherSolution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = IntStream
            .range(0, progresses.length)
            .mapToObj(i -> (int) Math.ceil((100.0 - progresses[i]) / speeds[i]))
            .collect(Collectors.toCollection(LinkedList::new));

        List<Integer> answer = new ArrayList<>();

        while (!queue.isEmpty()) {
            int remains = queue.poll();
            int count = 1;

            while (!queue.isEmpty() && remains >= queue.peek()) {
                queue.poll();
                count++;
            }

            answer.add(count);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

}
