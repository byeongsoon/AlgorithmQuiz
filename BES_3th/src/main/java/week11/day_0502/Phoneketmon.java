package week11.day_0502;

import java.util.HashSet;
import java.util.Set;

public class Phoneketmon {

    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> select = new HashSet<>();

        for (int n: nums) {
            select.add(n);
        }

        return Math.min(select.size(), nums.length / 2);
    }

}
