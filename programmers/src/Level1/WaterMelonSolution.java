package Level1;

public class WaterMelonSolution {
  public String solution(int n) {

    if (n > 10000){
      System.out.println("n은 10,000 이하인 자연수입니다.");
      return "";
    }

    String answer = "";

    for (int i = 0; i < n ; i++) {
      if (i % 2 == 0) {
        answer += "수";
      } else {
        answer += "박";
      }
    }

    return answer;

    /* 다른사람의 풀이중에서 가장 인상적인 코드

    return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);

     */

  }

  public static void main(String[] args) {
    WaterMelonSolution solution = new WaterMelonSolution();
    System.out.println(solution.solution(3));
  }

}
