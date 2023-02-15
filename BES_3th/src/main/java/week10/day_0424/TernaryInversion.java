package week10.day_0424;

public class TernaryInversion {

    public int solution(int n) {
        String ternary = Integer.toString(n,3);
        String[] ternaryArray = ternary.split("");
        StringBuilder answer = new StringBuilder();

        for (int i = ternary.length() - 1; i >= 0; i--) {
            answer.append(ternaryArray[i]);
        }

        return Integer.parseInt(answer.toString(), 3);
    }

}
