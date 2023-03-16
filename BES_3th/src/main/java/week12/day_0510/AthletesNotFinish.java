package week12.day_0510;


import java.util.*;

public class AthletesNotFinish {

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> hash = new HashMap<>();

        for (String s: participant) {
            hash.put(s, hash.getOrDefault(s, 0) + 1);
        }

        for (String s: completion) {
            hash.put(s, hash.get(s) - 1);
        }

        for (String key: hash.keySet()) {
            if (hash.get(key) != 0) {
                return key;
            }
        }

        return answer;
    }

}
