package week9.day_0419;

public class CalculateShortfall {

    public long solution(int price, int money, int count) {
        long totalPrice = 0;

        for (int i = 1; i <= count; i++) {
            totalPrice += (long) price * i;
        }

        if (money - totalPrice >= 0) {
            return 0;
        }
        return Math.abs(money-totalPrice);
    }

}
