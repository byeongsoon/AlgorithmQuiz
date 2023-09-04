package etc.level2;

public class NBaseGame {

    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();
        StringBuilder baseNumber = new StringBuilder();

        for (int i = 0; i < t * m; i++) {
            baseNumber.append(Integer.toString(i,n));
        }

        char[] bases = baseNumber.toString().toCharArray();
        for (int i = 0; i < t * 2; i++) {
            if (i % m  == p - 1) {
                answer.append(bases[i]);
            }
        }

        return answer.toString().toUpperCase();
    }

}
