package week5.day_0322;

import java.util.HashMap;
import java.util.Map;

public class HateEnglish {

    public long solution(String numbers) {
        Map<String, Long> numberMapping = new HashMap<>();
        numberMapping.put("zero",0L); numberMapping.put("one",1L); numberMapping.put("two",2L);
        numberMapping.put("three",3L); numberMapping.put("four",4L); numberMapping.put("five",5L);
        numberMapping.put("six",6L); numberMapping.put("seven",7L); numberMapping.put("eight",8L);
        numberMapping.put("nine",9L);

        long answer = 0;
        String[] numbersSplit = numbers.split("");

        String key = "";
        int size = numbersSplit.length;
        for (int i = 0; i < size; i++) {
            key += numbersSplit[i];
            if (numberMapping.containsKey(key)) {
                answer += numberMapping.get(key);
                key = "";
                answer *= 10;
            }
        }
        answer /= 10;

        return answer;
    }

}
