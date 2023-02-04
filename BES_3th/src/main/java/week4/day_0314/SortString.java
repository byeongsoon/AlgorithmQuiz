package week4.day_0314;

import java.util.Arrays;

public class SortString {

    public int[] solution(String my_string) {
        String[] splits = my_string.split("");

        return Arrays.stream(splits)
            .filter(i -> i.matches("[0-9]"))
            .mapToInt(Integer::parseInt)
            .sorted()
            .toArray();
    }

}
