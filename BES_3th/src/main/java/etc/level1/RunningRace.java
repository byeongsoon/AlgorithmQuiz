package etc.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RunningRace {

    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        List<String> list = new ArrayList<>();
        for (String player : players) {
            list.add(player);
        }

        for (String call : callings) {
            int index = list.indexOf(call);
            Collections.swap(list, index, index - 1);
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

}
