package week5.day_0322;

import java.util.HashSet;
import java.util.Set;

public class Factorization {

    public int[] solution(int n) {
        Set<Integer> answer = new HashSet<>();

        while (n != 1) {
            int result = getDivisibleNumber(n);
            answer.add(result);
            n /= result;
        }

        return answer.stream()
            .mapToInt(Integer::intValue)
            .sorted()
            .toArray();
    }

    private int getDivisibleNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return i;
            }
        }
        return number;
    }

}
