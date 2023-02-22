package week11.day_0501;

import java.util.HashMap;
import java.util.Map;

public class StringOfNumberAndWord {

    public int solution(String s) {
        Map<String, Integer> wordToNumber = new HashMap<>();
        wordToNumber.put("zero", 0); wordToNumber.put("one", 1); wordToNumber.put("two", 2);
        wordToNumber.put("three", 3); wordToNumber.put("four", 4); wordToNumber.put("five", 5);
        wordToNumber.put("six", 6); wordToNumber.put("seven", 7); wordToNumber.put("eight", 8);
        wordToNumber.put("nine", 9);

        StringBuilder answer = new StringBuilder();
        String word = "";
        for (char c: s.toCharArray()) {
            if (Character.isDigit(c)) {
                answer.append(c);
                continue;
            }
            word += c;
            if (wordToNumber.containsKey(word)) {
                answer.append(wordToNumber.get(word));
                word = "";
            }
        }

        return Integer.parseInt(answer.toString());
    }

}
