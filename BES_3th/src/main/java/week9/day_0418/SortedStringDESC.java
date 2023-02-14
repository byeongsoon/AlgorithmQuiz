package week9.day_0418;

import java.util.Arrays;
import java.util.Collections;

public class SortedStringDESC {

    public String solution(String s) {
        String[] split = s.split("");
        Arrays.sort(split, Collections.reverseOrder());

        return String.join("",split);
    }

}
