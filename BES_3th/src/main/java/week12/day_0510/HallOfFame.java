package week12.day_0510;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HallOfFame {

    public int[] solution(int k, int[] score) {
        int size = score.length;
        int[] answer = new int[size];
        List<Integer> hallOfFame = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            if (hallOfFame.size() != k) {
                hallOfFame.add(score[i]);
            } else if (hallOfFame.get(0) < score[i]) {
                hallOfFame.remove(0);
                hallOfFame.add(score[i]);
            }

            Collections.sort(hallOfFame);
            answer[i] = hallOfFame.get(0);
        }

        return answer;
    }

}