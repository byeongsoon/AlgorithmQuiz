package week6.day_0330;

import java.util.ArrayList;
import java.util.List;

public class Babbling {
    public int solution(String[] babbling) {
        int answer = 0;
        List<String> possible = init();

        for (String s: babbling) {
            answer += checkBabbling(s, possible);
        }

        return answer;
    }

    private int checkBabbling(String babbling, List<String> possible) {
        for (int i = 0; i < possible.size(); i++) {
            if (babbling.contains(possible.get(i))) {
                babbling = babbling.replace(possible.get(i), " ");
            }
        }
        babbling = babbling.replace(" ", "");
        if ("".equals(babbling)) {
            return 1;
        }
        return 0;
    }

    private List<String> init() {
        List<String> possibleBabbling =new ArrayList<>();
        possibleBabbling.add("aya");
        possibleBabbling.add("ye");
        possibleBabbling.add("woo");
        possibleBabbling.add("ma");

        return possibleBabbling;
    }

}
