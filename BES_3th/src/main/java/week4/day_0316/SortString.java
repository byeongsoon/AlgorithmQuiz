package week4.day_0316;

import java.util.Arrays;

public class SortString {

    public String solution(String my_string) {
        my_string = my_string.toLowerCase();

        char[] inputArray = my_string.toCharArray();
        Arrays.sort(inputArray);

        return String.valueOf(inputArray);
    }

}
