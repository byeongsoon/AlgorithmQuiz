package week3.day_0307;

public class RemoveSpecificCharacter {

    public String solution(String my_string, String letter) {
        StringBuilder answer = new StringBuilder();
        String[] strings = my_string.split("");

        for (final String string : strings) {
            if (letter.equals(string)) {
                continue;
            }
            answer.append(string);
        }

        return answer.toString();
    }

}
