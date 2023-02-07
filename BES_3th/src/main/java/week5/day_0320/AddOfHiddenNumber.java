package week5.day_0320;

import java.util.Arrays;

public class AddOfHiddenNumber {

    public int solution(String my_string) {
        int answer = 0;

        String[] splits = my_string.split("[a-zA-Z]");
        for (int i = 0; i < splits.length; i++) {
            if (!splits[i].isEmpty()) {
                answer += Integer.parseInt(splits[i]);
            }
        }

        return answer;
    }

}
