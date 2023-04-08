package etc.level1;

import java.util.*;

public class RunningRace {

    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        Map<Integer, String> indexMap = new HashMap<>();
        Map<String, Integer> playerMap = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            indexMap.put(i,players[i]);
            playerMap.put(players[i],i);
        }

        for (String call : callings) {
            int index = playerMap.get(call);
            String temp = indexMap.get(index - 1);

            playerMap.put(call, index - 1);
            playerMap.put(temp, index);

            indexMap.put(index - 1, call);
            indexMap.put(index, temp);
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = indexMap.get(i);
        }

        return answer;
    }

}
