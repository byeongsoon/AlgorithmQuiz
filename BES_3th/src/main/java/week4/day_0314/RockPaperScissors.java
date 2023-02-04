package week4.day_0314;

public class RockPaperScissors {

    // 가위 2, 바위 0, 보 5
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        String[] strings = rsp.split("");

        for (String s: strings) {
            answer.append(winGame(s));
        }

        return answer.toString();
    }

    private String winGame(String input) {
        if ("2".equals(input)) {
            return "0";
        } else if ("0".equals(input)) {
            return "5";
        }
        return "2";
    }

}
