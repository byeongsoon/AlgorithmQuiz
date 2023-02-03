package week3.day_0310;

public class DetermineSquareNumber {

    public int solution(int n) {
        int squareNumber = 0, i = 0;

        while (squareNumber < n) {
            squareNumber = i * i;
            i++;

            if (squareNumber == n) {
                return 1;
            }
        }

        return 2;
    }

}
