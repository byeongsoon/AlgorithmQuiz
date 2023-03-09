package week12.day_0508;

import java.util.Arrays;

public class DartGame {

    public int solution(String dartResult) {
        int[] score = new int[3];
        String[] results = dartResult.split("");

        for (int i = 0, index = 0; i < results.length; i++) {
            if (results[i].matches("[0-9]")) {
                if ("1".equals(results[i]) && "0".equals(results[i+1])) {
                    score[index++] = Integer.parseInt(results[i]+results[i+1]);
                    i++;
                    continue;
                }
                score[index++] = Integer.parseInt(results[i]);
            }
            if ("S".equals(results[i]) || "D".equals(results[i]) || "T".equals(results[i])) {
                score[index-1] = calculateBonus(results[i], score[index-1]);
            }
            if ("#".equals(results[i]) || "*".equals(results[i])) {
                calculateOption(score, results[i], index);
            }
        }

        return Arrays.stream(score).sum();

        /*
        int answer = 0;
        for (int n: score) {
            answer += n;
        }
        return answer;
         */
    }

    private int calculateBonus(String bonus, int score) {
        if ("S".equals(bonus)) {
            return (int) Math.pow(score, 1);
        } else if ("D".equals(bonus)) {
            return (int) Math.pow(score, 2);
        }
        return (int) Math.pow(score, 3);
    }

    private void calculateOption(int[] score, String option, int index) {
        if ("*".equals(option)) {
            score[index-1] *= 2;
            if (index > 1) {
                score[index-2] *= 2;
            }
        } else if ("#".equals(option)) {
            score[index-1] *= -1;
        }
    }

}
