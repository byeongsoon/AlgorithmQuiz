package week12.day_0508;

public class DartGame {

    public int solution(String dartResult) {
        int answer = 0;
        int[] score = new int[4];
        String[] results = dartResult.split("");

        for (int i = 0, index = 0; i < results.length; i++) {
            if (results[i].matches("[0-9]")) {
                if ("1".equals(results[i]) && "0".equals(results[i+1])) {
                    score[index++] = Integer.parseInt(results[i]+results[i+1]);
                    i++;
                    continue;
                }
                score[index++] = Integer.parseInt(results[i]);
            }
            if ("S".equals(results[i]) || "D".equals(results[i]) || "T".equals(results[i])) {
                score[index-1] = calculateBonus(results[i], score[index-1]);
            }
            if ("#".equals(results[i]) || "*".equals(results[i])) {
                calculateOption(score, results[i], index);
            }
        }

        for (int n: score) {
            answer += n;
        }

        return answer;
    }

    private int calculateBonus(String bonus, int score) {
        if ("S".equals(bonus)) {
            return (int) Math.pow(score, 1);
        } else if ("D".equals(bonus)) {
            return (int) Math.pow(score, 2);
        }
        return (int) Math.pow(score, 3);
    }

    private void calculateOption(int[] score, String option, int index) {
        if ("*".equals(option)) {
            System.out.println(index);
            score[index-1] *= 2;
            if (index > 1) {
                score[index-2] *= 2;
            }
//            for (int i = 0; i < index; i++) {
//                score[i] *= 2;
//            }
        } else if ("#".equals(option)) {
            score[index-1] *= -1;
        }
    }

    public static void main(String[] args) {
        DartGame test = new DartGame();
        int answer = test.solution("1D2S3T*");
        // 2 + 4 + 54
        System.out.println(answer);
        answer = test.solution("10D4S10D");
        System.out.println(answer);
    }

}
