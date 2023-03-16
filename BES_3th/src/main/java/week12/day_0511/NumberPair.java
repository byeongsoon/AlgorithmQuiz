package week12.day_0511;

import java.util.*;
import java.util.stream.Collectors;

/*
 * 짝궁에 들어갈 숫자를 선별할 때 일반 문자열에 '+' 연산자를 이용해서 할 때는 시간초과가 나왔다.
 * list에 같은 key 값을 넣어줄 때에도 for문 말고 repeat로 변경
 */
public class NumberPair {

    public String solution(String X, String Y) {
        List<String> list = new ArrayList<>();
        Map<String, Integer> xMap = new HashMap<>();
        Map<String, Integer> yMap = new HashMap<>();

        for (String s: X.split("")) {
            xMap.put(s, xMap.getOrDefault(s, 0) + 1);
        }

        for (String s: Y.split("")) {
            yMap.put(s, yMap.getOrDefault(s, 0) + 1);
        }

        for (String key: xMap.keySet()) {
            if (!yMap.containsKey(key)) {
                continue;
            }
            int length = Math.min(xMap.get(key), yMap.get(key));
            list.add(key.repeat(length));
        }

        String answer = list.stream()
            .sorted(Collections.reverseOrder())
            .collect(Collectors.joining());

        if (answer.isEmpty()) {
            return "-1";
        } else if (answer.replaceAll("0", "").isEmpty()) {
            return "0";
        }
        return answer;
    }

}