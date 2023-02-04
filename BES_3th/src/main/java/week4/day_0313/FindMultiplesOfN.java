package week4.day_0313;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMultiplesOfN {

    public int[] solution(int n, int[] numlist) {
        List<Integer> multiples = new ArrayList<>();

        for (int m: numlist) {
            if (m % n == 0) {
                multiples.add(m);
            }
        }

        return multiples.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }

    public int[] otherSolution(int n, int[] numlist) {
        return Arrays.stream(numlist)
            .filter(value -> value % n == 0)
            .toArray();
    }

}
