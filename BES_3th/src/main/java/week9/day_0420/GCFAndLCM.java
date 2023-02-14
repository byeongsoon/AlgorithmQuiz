package week9.day_0420;

// GCF(최대공약수) : Greatest Common Factor
// LCM(최소공배수) : Least Common Multiple
public class GCFAndLCM {

    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        if (n < m) {
            answer[0] = getGreatestCommonFactor(n,m);
            answer[1] = getLeastCommonMultiple(n,m,answer[0]);

            return answer;
        }

        answer[0] = getGreatestCommonFactor(m,n);
        answer[1] = getLeastCommonMultiple(m,n,answer[0]);
        return answer;
    }

    private int getLeastCommonMultiple(int a, int b, int gcf) {
        return a * (b / gcf);
    }

    private int getGreatestCommonFactor(int a, int b) { // a < b
        int result = 0;


        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                result = i;
            }
        }

        return result;
    }

}
