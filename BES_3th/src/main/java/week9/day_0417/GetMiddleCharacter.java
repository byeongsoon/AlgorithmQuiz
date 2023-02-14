package week9.day_0417;

public class GetMiddleCharacter {

    public String solution(String s) {
        String answer = "";
        int size = s.length();
        String[] split = s.split("");

        if (size % 2 != 0) {
            return split[size/2];
        }
        answer += split[size/2 - 1];
        answer += split[size/2];

        return answer;
    }

}
