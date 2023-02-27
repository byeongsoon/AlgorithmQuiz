package week11.day_0503;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MockExam {

    public int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> studentA = new ArrayList<>();
        List<Integer> studentB = new ArrayList<>();
        List<Integer> studentC = new ArrayList<>();

        init(studentA, studentB, studentC);

        List<Integer> scores = new ArrayList<>();
        scores.add(calculateScore(answers, studentA));
        scores.add(calculateScore(answers, studentB));
        scores.add(calculateScore(answers, studentC));

        int maxScore = Math.max(scores.get(0), Math.max(scores.get(1), scores.get(2)));

        for (int i = 1; i < 4; i++) {
            if (scores.get(i-1) == maxScore) {
                answer.add(i);
            }
        }

        return answer.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }

    private int calculateScore(int[] answers, List<Integer> student) {
        int result = 0;
        int i = 0;

        for (int n: answers) {
            if (i > student.size() - 1) {
                i = 0;
            }
            if (n == student.get(i)) {
                result++;
            }
            i++;
        }

        return result;
    }


    private void init(List<Integer> studentA, List<Integer> studentB, List<Integer> studentC) {
        studentA.add(1); studentA.add(2); studentA.add(3); studentA.add(4); studentA.add(5);

        studentB.add(2); studentB.add(1); studentB.add(2); studentB.add(3);
        studentB.add(2); studentB.add(4); studentB.add(2); studentB.add(5);

        studentC.add(3); studentC.add(3); studentC.add(1); studentC.add(1); studentC.add(2);
        studentC.add(2); studentC.add(4); studentC.add(4); studentC.add(5); studentC.add(5);
    }

    public int[] otherSolution(int[] answer) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];

        for(int i=0; i<answer.length; i++) {
            if(answer[i] == a[i%a.length]) {
                score[0]++;
            }
            if(answer[i] == b[i%b.length]) {
                score[1]++;
            }
            if(answer[i] == c[i%c.length]) {
                score[2]++;
            }
        }

        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));

        ArrayList<Integer> list = new ArrayList<>();
        if(maxScore == score[0]) {
            list.add(1);
        }
        if(maxScore == score[1]) {
            list.add(2);
        }
        if(maxScore == score[2]) {
            list.add(3);
        }

        return list.stream().mapToInt(i->i.intValue()).toArray();
    }

}
