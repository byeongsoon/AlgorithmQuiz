package week3.day_0308;

import java.util.Arrays;

public class MakeMaxValue {

    public int solution(int[] numbers) {
        int answer = 0;
        int size = numbers.length;

        Arrays.sort(numbers);
        answer = numbers[size-1] * numbers[size-2];

        return answer;
    }

}
