package week2.day_0303;

public class ReverseString {

    public String solution(String my_string) {
        String answer = "";
        char[] myStringChars = my_string.toCharArray();
        int size = myStringChars.length;

        for (int i = size - 1; i >= 0; i--) {
            answer += myStringChars[i];
        }

        return answer;
    }

}
