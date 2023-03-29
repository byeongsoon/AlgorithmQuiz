package week13.day_0517;

import java.util.HashMap;
import java.util.Map;

public class PersonalityTypeTest {


    static final String[] indicators = {"RT", "CF", "JM", "AN"};
    static final int[] score = {3,2,1,0,1,2,3};
    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        Map<String, Integer> surveyScore = new HashMap<>();

        for (int i = 0; i < survey.length; i++) {
            String left = survey[i].substring(0,1);
            String right = survey[i].substring(1,2);

            int scoreIndex = choices[i] - 1;

            if (scoreIndex < 3) {
                surveyScore.put(left, surveyScore.getOrDefault(left, 0)  + score[scoreIndex]);
            } else if (scoreIndex > 3) {
                surveyScore.put(right, surveyScore.getOrDefault(right, 0) + score[scoreIndex]);
            }
        }

        for (String s: surveyScore.keySet()) {
            System.out.println(s + " : " + surveyScore.get(s));
        }

        for (String s : indicators) {
            answer.append(getResult(surveyScore, s));
        }

        return answer.toString();
    }

    private String getResult(Map<String, Integer> surveyScore, String indicator) {
        String left = indicator.substring(0,1);
        String right = indicator.substring(1,2);

        int leftValue = surveyScore.getOrDefault(left, 0);
        int rightValue = surveyScore.getOrDefault(right, 0);

        if (leftValue > rightValue) {
            return left;
        } else if (leftValue < rightValue) {
            return right;
        }

        if (left.compareTo(right) <= 0) {
            return left;
        }
        return right;
    }

}
