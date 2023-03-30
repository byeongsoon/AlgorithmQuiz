package etc;

import java.util.Objects;

public class MakeStringOfJadenCase {
    public String solution(String s) {
        s = s.toLowerCase();
        String[] inputArray = s.split("");
        String[] answer = new String[inputArray.length];

        String before = "";
        for (int i = 0; i < inputArray.length; i++) {
            if ("".equals(before) || (" ".equals(before) && !isInteger(inputArray[i]))) {
                before = inputArray[i];
                answer[i] = inputArray[i].toUpperCase();
                continue;
            }
            before = inputArray[i];
            answer[i] = inputArray[i];
        }

        return String.join("", answer);
    }

    private boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public String otherSolution(String s) {
        String answer = "";
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for(String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }

        return answer;
    }

}
