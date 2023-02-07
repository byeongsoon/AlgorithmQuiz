package week5.day_0320;


public class RemoveDuplicateCharacter {

    public String solution(String my_string) {
        String answer = "";
        String[] stringSplit = my_string.split("");

        for (String s: stringSplit) {
            if (!answer.contains(s)) {
                answer += s;
            }
        }

        return answer;
    }

}
