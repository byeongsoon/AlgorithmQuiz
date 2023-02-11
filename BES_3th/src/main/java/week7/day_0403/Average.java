package week7.day_0403;

public class Average {

    public double solution(int[] arr) {
        double count = 0;
        int sum = 0;

        for(int n: arr) {
            sum += n;
            count++;
        }

        return (double) sum / count;
    }

}
