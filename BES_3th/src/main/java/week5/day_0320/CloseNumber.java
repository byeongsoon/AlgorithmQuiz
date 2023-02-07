package week5.day_0320;

import java.util.Arrays;

public class CloseNumber {

    public int solution(int[] array, int n) {
        int sub = 100;
        int index = 0;

        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int result = Math.abs(array[i]-n);
            if (result < sub) {
                sub = result;
                index = i;
            }
        }

        return array[index];
    }

}
