package week12.day_0509;

import java.util.Arrays;
import java.util.Collections;

public class FruitSeller {

    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] scoreWrapper = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(scoreWrapper, Collections.reverseOrder());

        int size = scoreWrapper.length / m;
        for (int i = 0, index = m-1; i < size; i++) {
            answer += scoreWrapper[index] * m;
            index += m;
        }

        return answer;
    }

}
