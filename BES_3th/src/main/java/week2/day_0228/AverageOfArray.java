package week2.day_0228;

public class AverageOfArray {

    public double solution(int[] numbers) {
        double answer = 0;
        int size = numbers.length;
        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum += numbers[i];
        }
        answer = sum / (double) size;
        return answer;
    }

}
