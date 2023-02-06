package week5.day_0322;

public class ControlZ {

    public int solution(String s) {
        int answer = 0;
        String[] inputs = s.split(" ");

        int before = 0;
        for (String i: inputs) {
            if ("Z".equals(i)) {
                answer -= before;
                continue;
            }
            int number = Integer.parseInt(i);
            answer += number;
            before = number;
        }

        return answer;
    }

}
