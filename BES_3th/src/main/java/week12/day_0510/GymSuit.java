package week12.day_0510;

import java.util.HashSet;
import java.util.Set;

public class GymSuit {

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        Set<Integer> reserveSet = new HashSet<>();
        Set<Integer> lostSet = new HashSet<>();

        for (int m: reserve) {
            reserveSet.add(m);
        }

        for (int m: lost) {
            if (reserveSet.contains(m)) {
                reserveSet.remove(m);
                continue;
            }
            lostSet.add(m);

        }

        for (int k: lostSet) {
            if (reserveSet.contains(k - 1)) {
                reserveSet.remove(k - 1);
                continue;
            } else if (reserveSet.contains(k + 1)) {
                reserveSet.remove(k + 1);
                continue;
            }
            answer--;
        }

        return answer;
    }

}
