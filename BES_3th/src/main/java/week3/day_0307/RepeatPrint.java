package week3.day_0307;

public class RepeatPrint {

    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        String[] strings = my_string.split("");

        for (String s: strings) {
            for (int i = 0; i < n; i++) {
                answer.append(s);
            }
        }

        return answer.toString();
    }

}
