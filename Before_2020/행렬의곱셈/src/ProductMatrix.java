class ProductMatrix {
  public int[][] productMatrix(int[][] A, int[][] B) {
    int[][] answer = new int[A[0].length][A[1].length];

    for (int i = 0; i < A.length;i++){
      for (int j = 0; j < A[i].length; j++){
        answer[i][j] = A[i][0] * B[0][j] + A[i][1] * B[1][j];
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    ProductMatrix c = new ProductMatrix();
    int[][] a = { { 1, 2 }, { 2, 3 } };
    int[][] b = { { 3, 4 }, { 5, 6 } };

    int[][] result = c.productMatrix(a,b);

   //System.out.println("행렬의 곱셈 : " + c.productMatrix(a, b));

    for (int i = 0; i < result.length;i++){
      for (int j = 0; j < result[i].length; j++){
        System.out.print(result[i][j]+"\t");
      }
      System.out.println();
    }
  }
}
