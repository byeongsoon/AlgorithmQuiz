package week4.day_0316;

import java.util.HashMap;
import java.util.Map;

public class MorseCode {

    public String solution(String letter) {
        Map<String, String> alphabetMap = new HashMap<>() {
            {
                put(".-", "a"); put("-...", "b"); put("-.-.", "c");
                put("-..", "d"); put(".", "e"); put("..-.", "f");
                put("--.", "g"); put("....", "h"); put("..", "i");
                put(".---", "j"); put("-.-", "k"); put(".-..", "l");
                put("--", "m"); put("-.", "n"); put("---", "o");
                put(".--.", "p"); put("--.-", "q"); put(".-.", "r");
                put("...", "s"); put("-", "t"); put("..-", "u");
                put("...-", "v"); put(".--", "w"); put("-..-", "x");
                put("-.--", "y"); put("--..", "z");
            }
        };
        StringBuilder answer = new StringBuilder();
        String[] letterArray = letter.split(" ");

        for (String s: letterArray) {
            answer.append(alphabetMap.get(s));
        }

        return answer.toString();
    }

}
