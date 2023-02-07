package week5.day_0320;

import java.util.*;

public class AppearOnlyOnce {

    public String solution(String s) {
        String[] splits = s.split("");
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < splits.length; i++) {
            if (!set.contains(splits[i])) {
                set.add(splits[i]);
                list.add(splits[i]);
            } else {
                list.remove(splits[i]);
            }
        }

        Collections.sort(list);
        return String.join("",list);
    }

    public String otherSolution(String s) {
        int[] alpha = new int[26];
        for (char c: s.toCharArray()) {
            alpha[c - 'a']++;
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] == 1) {
                answer.append((char) (i + 'a'));
            }
        }

        return answer.toString();
    }

}
