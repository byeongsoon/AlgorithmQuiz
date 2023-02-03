package week3.day_0310;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySimilar {

    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        List<String> stringList = new ArrayList<>(Arrays.asList(s2));

        for (String s: s1) {
            if (stringList.contains(s)) {
                answer++;
            }
        }

        return answer;
    }

}
