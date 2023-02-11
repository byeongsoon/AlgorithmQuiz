package week7.day_0405;

import java.util.Arrays;
import java.util.Collections;

public class SortDescInteger {

    public long solution(long n) {
        long answer = 0;
        String[] numbers = String.valueOf(n).split("");

        Arrays.sort(numbers, Collections.reverseOrder());
        for (String s: numbers) {
            answer *= 10;
            answer += Integer.parseInt(s);
        }

        return answer;
    }

}
