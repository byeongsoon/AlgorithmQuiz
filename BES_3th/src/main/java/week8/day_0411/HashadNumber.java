package week8.day_0411;

public class HashadNumber {

    public boolean solution(int x) {
        int sum = 0, tmp = x;

        while (x > 0) {
            sum += (x % 10);
            x /= 10;
        }

        if (tmp % sum == 0) {
            return true;
        }
        return false;
    }

}
