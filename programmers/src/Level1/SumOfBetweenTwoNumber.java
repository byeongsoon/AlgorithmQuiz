package Level1;

public class SumOfBetweenTwoNumber {

  public static void main(String[] args) {
    SumOfBetweenTwoNumber solution = new SumOfBetweenTwoNumber();
    System.out.println(solution.solution(3,5));
    System.out.println(solution.solution(3,3));
    System.out.println(solution.solution(5,3));
  }

  public long solution(int a, int b) {
    long answer = 0;

    if (a == b) {
      return a;
    } else if (a > b) {
      for (int i = b; i <= a; i++) {
        answer += i;
      }
    } else {
      for (int i = a; i <= b; i++ ){
        answer += i;
      }
    }

    return answer;
  }

}

/* 인상적인 풀이

  public long solution(int a, int b) {
    return sumAtoB(Math.min(a,b), Math.max(b, a));
  }

  private long sumAtoB(long a, long b) { // 등차수열 합 공식 (a1+an)/2 * n
    return (b - a + 1) * (a + b) / 2;
  }

 */