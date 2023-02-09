package week6.day_0329;

public class OXQuiz {

    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        int index = 0;
        for (String s: quiz) {
            String[] quizValue = s.split(" ");
            answer[index++] = calculatorQuiz(quizValue);
        }

        return answer;
    }

    private String calculatorQuiz(String[] quiz) {
        int a = Integer.parseInt(quiz[0]);
        int b = Integer.parseInt(quiz[2]);

        if ("+".equals(quiz[1])) {
            return (a + b) == Integer.parseInt(quiz[4]) ? "O" : "X";
        }

        return (a - b) == Integer.parseInt(quiz[4]) ? "O" : "X";
    }

}
