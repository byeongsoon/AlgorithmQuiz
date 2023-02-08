package week6.day_0328;

import java.util.*;

public class Ranking {

    // 1. 영어 점수와 수학 점수의 평균을 구한다 -> 여기서 주의할 점은 평균이 정수형이면 {1,3}, {2,3}이 평균이 2로 같게되므로 실수형으로 한다.
    // 2. 평균 점수를 반복문을 통해서 나보다 점수가 높은 사람을 카운트하면 몇등인지 알 수 있다.(등수 시작인 1)
    public int[] solution(final int[][] score) {
        final int size = score.length;
        final int[] answer = new int[size];
        final double[] average = calculatorAverage(score);

        for (int i = 0; i < size; i++) {
            answer[i] = rank(average[i], average);
        }

        return answer;
    }

    private int rank(final double number, final double[] arr) {
        int rank = 1;

        for (double n : arr) {
            if (number < n) {
                rank++;
            }
        }

        return rank;
    }

    private double[] calculatorAverage(final int[][] score) {
        final double[] result = new double[score.length];

        int index = 0;
        for (int[] arr: score) {
            result[index++] = ((double) arr[0] + (double) arr[1]) / 2;
        }

        return result;
    }

}
