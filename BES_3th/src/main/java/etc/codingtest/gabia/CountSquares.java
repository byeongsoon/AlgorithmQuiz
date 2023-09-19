package etc.codingtest.gabia;

public class CountSquares {
    public static void main(String[] args) {
        int n = 6; // 격자의 크기 (원하는 값으로 변경 가능)

        int result = 0;
        for (int i = 2; i <= n; i++) {
            result += countSquares(i);
        }
        System.out.println(result);
    }

    public static int countSquares(int n) {
        int squareCount = 0;

        // 격자의 가로 세로에 대해서 1부터 n까지 반복
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                // (i, j)를 정사각형의 왼쪽 상단 꼭지점으로 선택
                for (int side = 1; side <= Math.min(n - i, n - j); side++) {
                    // 정사각형의 한 변의 길이를 side로 설정
                    squareCount++;
                }
            }
        }

        return squareCount;
    }

}
