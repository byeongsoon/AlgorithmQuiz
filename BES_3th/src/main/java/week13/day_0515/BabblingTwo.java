package week13.day_0515;

import java.util.Arrays;
import java.util.List;

public class BabblingTwo {

    public int solution(String[] babbling) {
        int answer = 0;
        List<String> possible = Arrays.asList("aya", "ye", "woo", "ma");

        for (String s : babbling) {
            if (isPossibleBabbling(s, possible)) {
                answer++;
            }
        }

        return answer;
    }

    private boolean isPossibleBabbling(String s, List<String> possible) {
        String temp = s;
        for (String babble : possible) {
            if (temp.contains(babble.repeat(2))) {
                return false;
            }

            temp = temp.replaceAll(babble, " ");

            if (temp.isBlank()) {
                return true;
            }
        }

        return false;
    }

}
