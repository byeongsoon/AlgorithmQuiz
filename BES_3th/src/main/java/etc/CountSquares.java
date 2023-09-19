public class CountSquares {
    public static void main(String[] args) {
        int n = 4; // 격자의 크기 (원하는 값으로 변경 가능)

        int result = countSquares(n);
        System.out.println("n = " + n + " -> " + result + "개의 정사각형");
    }

    public static int countSquares(int n) {
        int squareCount = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = i + 1; k <= n; k++) {
                    for (int l = j + 1; l <= n; l++) {
                        // (i, j), (i, l), (k, j), (k, l)로 정사각형 만들기
                        int side = k - i;
                        if (l + side <= n) {
                            squareCount++;
                        }
                    }
                }
            }
        }

        return squareCount;
    }
}
