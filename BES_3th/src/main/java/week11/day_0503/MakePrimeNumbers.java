package week11.day_0503;

import java.util.*;

public class MakePrimeNumbers {

    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> numbers = new ArrayList<>();

        makeNumbers(numbers, nums);

        for (Integer number : numbers) {
            if (primeNumberCount(number)) {
                answer++;
            }
        }

        return answer;
    }

    private boolean primeNumberCount(final int number) {
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
            if (count > 2) {
                return false;
            }
        }

        return true;
    }

    private void makeNumbers(List<Integer> numbers, final int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    numbers.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }
    }

}
