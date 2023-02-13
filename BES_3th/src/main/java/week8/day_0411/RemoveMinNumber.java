package week8.day_0411;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveMinNumber {

    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int[] temp = arr.clone();

        Arrays.sort(temp);
        for (int n: arr) {
            if (n != temp[0]) {
                answer.add(n);
            }
        }
        if (answer.size() == 0) {
            answer.add(-1);
        }

        return answer.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }

}
