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

        while(true) {
            if (progress.isEmpty()) {
                break;
            }

            System.out.println(progress.size());

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
        int count = 0, index = 0;

        while(true) {
            if (progress.isEmpty() || progress.get(0) < 100) {
                break;
            }
            progress.remove(0);
            speed.remove(0);
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        FunctionDevelopment test = new FunctionDevelopment();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        test.solution(progresses, speeds);
    }

}
