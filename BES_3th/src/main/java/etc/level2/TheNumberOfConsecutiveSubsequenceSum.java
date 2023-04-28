package etc.level2;

import java.util.HashSet;
import java.util.Set;

public class TheNumberOfConsecutiveSubsequenceSum {

    public int solution(int[] elements) {
        Set<Integer> answer = new HashSet<>();

        for (int i = 0; i < elements.length; i++) {
            int size = i + 1;
            int start = 0;

            while (start != elements.length) {
                int sum = 0;
                for (int j = start; j < start + size; j++) {
                    sum += elements[j % elements.length];
                }
                answer.add(sum);
                start++;
            }
        }
        return answer.size();
    }

}
