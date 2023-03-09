package week12.day_0508;

import java.util.*;

public class FailureRate {

    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int person = stages.length;
        Map<Integer, Double> result = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            int userStay = stageStayUserCount(stages, i);

            if (userStay == 0) {
                result.put(i, 0.0);
                continue;
            }

            double failureRate = (double) userStay / person;
            result.put(i, failureRate);

            person -= userStay;
        }

        List<Integer> keySet = new ArrayList<>(result.keySet());
        keySet.sort(((o1, o2) -> result.get(o2).compareTo(result.get(o1))));

        int i = 0;
        for (double key: keySet) {
            answer[i++] = (int) key;
        }

        return answer;
    }

    private int stageStayUserCount(int[] stages, int stage) {
        int result = 0;

        for (int n: stages) {
            if (n == stage) {
                result++;
            }
        }

        return result;
    }

}
