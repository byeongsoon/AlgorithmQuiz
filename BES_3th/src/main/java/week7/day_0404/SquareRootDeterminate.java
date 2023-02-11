package week7.day_0404;

public class SquareRootDeterminate {

    public long solution(long n) {
        long i = 1;

        while (i*i <= n) {
            if (i*i == n) {
                return (long) Math.pow(i+1, 2);
            }
            i++;
        }

        return -1;
    }

}
