package week5.day_0322;

public class StringCalculator {

    public int solution(String my_string) {
        String[] stringSplit = my_string.split(" ");
        int answer = Integer.parseInt(stringSplit[0]);

        for (int i = 1; i < stringSplit.length; i+=2) {
            if ("+".equals(stringSplit[i])) {
                answer += Integer.parseInt(stringSplit[i+1]);
            }
            else answer -= Integer.parseInt(stringSplit[i+1]);
        }

        return answer;
    }

}
