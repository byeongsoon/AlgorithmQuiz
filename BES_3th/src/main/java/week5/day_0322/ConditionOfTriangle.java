package week5.day_0322;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConditionOfTriangle {

    // 가장 긴 변의 길이가 나머지 다른 두 변의 길이의 합보다 작아야 한다.
    public static int solution(int[] sides) {
        Arrays.sort(sides);
        Set<Integer> answer = new HashSet<>();

        // index 1이 가장 긴 변인 경우
        for (int i = 1; i <= sides[1]; i++) {
            if (sides[0] + i > sides[1]) {
                answer.add(i);
            }
        }

        // 나머지 한 변이 가장 긴 변인 경우
        int sum = sides[0] + sides[1];
        for (int i = sides[1] + 1; i < sum; i++) {
            if (sum > i) {
                answer.add(i);
            }
        }

        return answer.size();
    }

}
