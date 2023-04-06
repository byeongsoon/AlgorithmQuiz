package week15;

import java.util.Arrays;
import java.util.Collections;

public class HIndex {

    public int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            int min = Math.min(citations[i], citations.length - i);
            answer = Math.max(answer, min);
        }

        return answer;
    }

}
