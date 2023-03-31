package week14;

import java.util.HashSet;
import java.util.Set;

public class EnglishConnectEnding {

    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Set<String> wordSet = new HashSet<>();

        wordSet.add(words[0]);
        int count = 1, userNumber = 1, i = 1;
        for (; i < words.length; i++) {
            userNumber++;
            if (userNumber > n) {
                userNumber = 1;
                count++;
            }

            if (wordSet.contains(words[i])) {
                break;
            }
            if (!isFollowRule(words[i],words[i-1])) {
                break;
            }

            wordSet.add(words[i]);
        }

        if (i >= words.length) {
            return answer;
        }
        answer[0] = userNumber;
        answer[1] = count;
        return answer;
    }

    private boolean isFollowRule(String s1, String s2) {
        return s1.charAt(0) == s2.charAt(s2.length() - 1);
    }

}
