package week3.day_0308;

import java.util.Arrays;

public class ConditionOfTriangle {

    public int solution(int[] sides) {
        Arrays.sort(sides);
        if (sides[2] < sides[0] + sides[1]) {
            return 1;
        }
        return 2;
    }

}
