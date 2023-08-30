package etc.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Compression {

    public int[] solution(String msg) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> index = init();

        while (!"".equals(msg)) {
            msg = compression(msg, index, answer);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private String compression(String message, Map<String, Integer> index, List<Integer> answer) {
        char[] chars = message.toCharArray();
        int i = 0;

        String removeTarget;
        String newIndex = String.valueOf(chars[i]);
        while (chars.length != newIndex.length() && index.containsKey(newIndex)) {
            newIndex = newIndex.concat(String.valueOf(chars[++i]));
        }

        if (!index.containsKey(newIndex)) {
            index.put(newIndex, index.size() + 1);
            removeTarget = newIndex.substring(0, newIndex.length() - 1);
        } else {
            removeTarget = newIndex;
        }

        message = message.replaceFirst(removeTarget, "");
        answer.add(index.get(removeTarget));

        return message;
    }

    private Map<String, Integer> init() {
        Map<String, Integer> index = new HashMap<>();

        char ch = 'A';
        for (int i = 1; i <= 26; i++) {
            index.put(String.valueOf(ch++),i);
        }

        return index;
    }

}