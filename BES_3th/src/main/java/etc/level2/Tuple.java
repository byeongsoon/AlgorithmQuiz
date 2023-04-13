package etc.level2;

import java.util.*;

public class Tuple {

    public int[] solution(String s) {
        s = s.replaceAll("[{}]","");
        Map<String, Integer> map = new HashMap<>();
        for (String e : s.split(",")) {
            map.put(e, map.getOrDefault(e,0) + 1);
        }

        List<String> list = new ArrayList<>(map.keySet());
        list.sort(((o1, o2) -> map.get(o2).compareTo(map.get(o1))));

        int[] answer = new int[list.size()];
        int index = 0;
        for (String s1 : list) {
            answer[index++] = Integer.parseInt(s1);
        }

        return answer;
    }

}
