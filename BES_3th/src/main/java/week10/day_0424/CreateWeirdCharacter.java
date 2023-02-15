package week10.day_0424;

public class CreateWeirdCharacter {

    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int count = 0;
        String[] splits = s.split("");

        for (String split: splits) {
            if (split.contains(" ")) {
                count = 0;
                answer.append(" ");
                continue;
            }
            count++;
            answer.append(convertUpperOrLower(split, count));
        }

        return answer.toString();
    }

    private String convertUpperOrLower(String input, int count) {
        if (count % 2 == 0) {
            return input.toLowerCase();
        }
        return input.toUpperCase();
    }

    // 알고리즘 문제를 해결할 땐 삼항연산자를 써도 되는가..?
    public String otherSolution(String s) {
        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }
        return answer;
    }

}
