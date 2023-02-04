package week4.day_0314;

public class NumberOfDice {

    public static int solution(int[] box, int n) {
        int width = box[0] / n;
        int length = box[1] / n;
        int height = box[2] / n;

        return width * length * height;
    }

}
