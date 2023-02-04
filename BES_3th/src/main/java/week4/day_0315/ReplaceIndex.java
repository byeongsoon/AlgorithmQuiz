package week4.day_0315;

public class ReplaceIndex {

    public String solution(String my_string, int num1, int num2) {
        StringBuilder answer = new StringBuilder();
        String[] splits = my_string.split("");

        for (int i = 0; i < splits.length; i++) {
            if (i == num1) {
                answer.append(splits[num2]);
                continue;
            } else if (i == num2) {
                answer.append(splits[num1]);
                continue;
            }
            answer.append(splits[i]);
        }

        return answer.toString();
    }

}
