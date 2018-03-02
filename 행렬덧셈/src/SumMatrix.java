public class SumMatrix {
  int [][] sumMatrix(int[][] A, int[][] B){
    int [][] result = {{0,0},{0,0}};
    for(int i = 0; i < A.length; i++){
      for(int j = 0; j < A[i].length; j++){
        result[i][j] = A[i][j] + B[i][j];
      }
    }
    return result;
  }
  public static void main(String[] args){
    SumMatrix C = new SumMatrix();
    int [][] A = {{1,2},{2,3}};
    int [][] B = {{3,4},{5,6}};
    int [][] answer = C.sumMatrix(A,B);

    if (answer[0][0] == 4 && answer[0][1] == 6 &&
        answer[1][0] == 7 && answer[1][1] == 9) {
      System.out.println("맞았습니다. 제출을 눌러 보세요");
    } else {
      System.out.println("틀렸습니다. 수정하는게 좋겠어요");
    }
  }
}
