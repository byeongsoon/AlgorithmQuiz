package week6.day_0329;

import java.util.Arrays;

public class SumOfConsecutiveNumber {

    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int startNumber = total / num;

        answer[0] = startNumber;
        int sumValue = 1;
        for (int i = 1; i < num; i+=2) {
            answer[i] = startNumber + sumValue;
            if ((i + 1) <= (num - 1)) {
                answer[i+1] = startNumber - sumValue;
            }
            sumValue++;
        }

        Arrays.sort(answer);
        return answer;
    }

}
