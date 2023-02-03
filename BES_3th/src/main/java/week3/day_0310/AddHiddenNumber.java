package week3.day_0310;

public class AddHiddenNumber {

    public int solution(String my_string) {
        int answer = 0;
        char[] chars = my_string.toCharArray();

        for (char c: chars) {
            if ('0' <= c && c <= '9') {
                answer += c - '0';
                // another solution
//                answer += Character.getNumericValue(c);
            }
        }

        return answer;
    }

}
