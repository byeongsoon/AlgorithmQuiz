package week13.day_0515;

import java.util.Objects;

public class SplitString {

    public int solution(String s) {
        int answer = 0;
        int sameCharCount = 1;
        int differentCharCount = 0;
        char first = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (s.replaceAll(String.valueOf(first),"").isEmpty()) {
                answer++;
                break;
            }
            if (first == 'N') {
                first = s.charAt(i);
                continue;
            }

            if (first == s.charAt(i)) {
                sameCharCount++;
            } else {
                differentCharCount++;
            }

            if (sameCharCount == differentCharCount) {
                answer++;
                first = 'N';
                sameCharCount = 1;
                differentCharCount = 0;
            }
        }

        if (first != 'N') {
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        SplitString test = new SplitString();
        System.out.println(test.solution("abracadabraaaa"));
    }

}
