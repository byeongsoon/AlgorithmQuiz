import java.util.Arrays;

public class MinSum {
  public int getMinSum(int []A, int []B)
  {
    int answer = 0;
    /*  // 1차 풀이
    String[] strings = new String[B.length];
    for (int i = 0; i < B.length; i++){
      strings[i] = String.valueOf(B[i]);
    }

    Arrays.sort(A);
    Arrays.sort(strings, Collections.reverseOrder());

    for(int i = 0; i < A.length; i++){
      answer += A[i] * Integer.parseInt(strings[i]);
    }
    */
    // 2차 풀이
    Arrays.sort(A);
    Arrays.sort(B);

    for (int i = 0; i < A.length ; i++){
      answer += A[i] * B[A.length-1-i];
    }

    return answer;
  }
  public static void main(String[] args)
  {
    MinSum test = new MinSum();
    int []A = {1,2,3};
    int []B = {4,5,6};
    System.out.println(test.getMinSum(A,B));

    int []C = {1,2};
    int []D = {4,3};
    System.out.println(test.getMinSum(C,D));
  }
}
