package week3.day_0310;

public class VowelRemove {

    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        String vowel = "aeiou";

        String[] strings = my_string.split("");
        for (String s : strings) {
            if(!vowel.contains(s)) {
                answer.append(s);
            }
        }

        return answer.toString();
    }

}
