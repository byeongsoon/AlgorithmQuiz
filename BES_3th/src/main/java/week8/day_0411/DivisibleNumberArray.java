package week8.day_0411;

import java.util.ArrayList;
import java.util.List;

public class DivisibleNumberArray {

    public int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();

        for (int n: arr) {
            if (n % divisor == 0) {
                answer.add(n);
            }
        }
        if (answer.size() == 0) {
            answer.add(-1);
        }

        return answer.stream()
            .sorted()
            .mapToInt(Integer::intValue)
            .toArray();
    }

}
