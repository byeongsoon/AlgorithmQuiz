package week14;

import java.util.Arrays;
import java.util.Collections;

public class MakeMinimum {

    public int solution(int[] A, int[] B) {
        Integer answer = 0;
        Integer[] tempB = Arrays.stream(B).boxed().toArray(Integer[]::new);

        Arrays.sort(A);
        Arrays.sort(tempB, Collections.reverseOrder());

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * tempB[i];
        }

        return answer;
    }

}
