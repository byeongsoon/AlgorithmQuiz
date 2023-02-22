package week10.day_0426;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OnMyOwnSort {

    public String[] solution(String[] strings, int n) {
        int size = strings.length;
        String[] answer = new String[size];
        List<String> sortedList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            sortedList.add("" + strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(sortedList);
        for (int i = 0; i < size; i++) {
            String sorted = sortedList.get(i);
            answer[i] = sorted.substring(1);
        }

        return answer;
    }

}
