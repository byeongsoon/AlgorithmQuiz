package week4.day_0315;

import java.util.Arrays;

public class MakeMaxNumber {

    public int solution(int[] numbers) {
        int size = numbers.length;
        Arrays.sort(numbers);

        int plus = numbers[size-1] * numbers[size-2];
        int minus = numbers[0] * numbers[1];

        if (plus > minus) {
            return plus;
        }
        return minus;
    }

}
