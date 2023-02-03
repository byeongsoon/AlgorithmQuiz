package week3.day_0309;

import java.util.Arrays;

public class FindMediumValue {

    public int solution(int[] array) {
        int medium = (array.length / 2);
        Arrays.sort(array);

        return array[medium];
    }

}
