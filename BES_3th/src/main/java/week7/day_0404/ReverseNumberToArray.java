package week7.day_0404;

import java.util.ArrayList;
import java.util.List;

public class ReverseNumberToArray {

    public int[] solution(long n) {
        List<Long> answer = new ArrayList<>();

        while (n > 0) {
            answer.add(n % 10);
            n /= 10;
        }

        return answer.stream()
            .mapToInt(Long::intValue)
            .toArray();
    }

}
