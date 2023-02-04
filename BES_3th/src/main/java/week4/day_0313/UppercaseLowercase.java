package week4.day_0313;

public class UppercaseLowercase {

    public String solution(String my_string) {
        String answer = "";
        char[] chars = my_string.toCharArray();

        // 영문 대문자는 65 ~ 90 / 소문자는 97 ~ 122
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 65 && chars[i] <= 90) {
                answer += (char) (chars[i] + 32);
            } else if (chars[i] >= 97 && chars[i] <= 122) {
                answer += (char) (chars[i] - 32);
            }
        }

        return answer;
    }

}
