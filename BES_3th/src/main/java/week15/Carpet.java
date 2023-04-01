package week15;

import java.util.ArrayList;
import java.util.List;

public class Carpet {

    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int[] divisor = getDivisor(brown+yellow);
        int size = divisor.length;
        answer[0] = divisor[size / 2];

        int xIndex = size / 2;
        int yIndex = 0;
        if (size % 2 == 0) {
            answer[1] = divisor[size / 2 - 1];
            yIndex = size / 2 - 1;
        } else {
            answer[1] = divisor[size / 2];
            yIndex = size / 2;
        }

        while (!((answer[0]-2) * (answer[1] -2) == yellow)) {
            answer[0] = divisor[++xIndex];
            answer[1] = divisor[--yIndex];
        }

        return answer;
    }

    private int[] getDivisor(int number) {
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                result.add(i);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

}
