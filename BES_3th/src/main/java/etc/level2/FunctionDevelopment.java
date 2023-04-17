package etc.level2;

import java.util.ArrayList;
import java.util.List;

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

}
