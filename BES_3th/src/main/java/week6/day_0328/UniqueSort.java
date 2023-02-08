package week6.day_0328;

import java.util.Arrays;

public class UniqueSort {

    public int[] solution(int[] numlist, int n) {
        int size = numlist.length;
        int[] answer = new int[size];

        Arrays.sort(numlist);
        for (int i = 0; i < size; i++) {
            answer[i] = setResult(numlist, n);
            exclude(numlist, answer[i]);
        }

        return answer;
    }

    private int setResult(int[] numList, int number) {
        int difference = 10_000;
        int result = 0;

        for (int i = numList.length - 1; i >= 0; i--) {
            int absoluteValue = Math.abs(number - numList[i]);
            if (absoluteValue < difference) {
                difference = absoluteValue;
                result = numList[i];
            }
        }

        return result;
    }

    private void exclude(int[] numList, int result) {
        for (int i = 0; i < numList.length; i++) {
            if (numList[i] == result) {
                numList[i] = -10_000;
            }
        }
    }

}
