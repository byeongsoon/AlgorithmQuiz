package week5.day_0322;

import java.math.BigInteger;

public class NumberOfDivideMarble {

    /*
    * 기존 문제에서 제공된 int 자료형으로는 히든 케이스 실패가 많이 뜬다.
    * 아마 숫자의 값이 int의 범위를 넘어가서 그런 것으로 추정
     */
    public BigInteger solution(int balls, int share) {
        return factorial(balls).divide(factorial(balls-share).multiply(factorial(share)));
    }

    private BigInteger factorial(int n) {
        BigInteger big = new BigInteger("1");

        for (int i = 1; i <= n; i++) {
            big = big.multiply(new BigInteger(Integer.toString(i)));
        }
        return big;
    }

}
