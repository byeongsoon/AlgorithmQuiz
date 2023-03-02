package week11.day_0503;

public class FoodFightCompetition {

    public String solution(int[] food) {
        StringBuilder before = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                before.append(i);
            }
        }

        String answer = before.toString();
        answer += "0";

        StringBuilder reverseAnswer = before.reverse();
        answer += reverseAnswer.toString();

        return answer;
    }

}
