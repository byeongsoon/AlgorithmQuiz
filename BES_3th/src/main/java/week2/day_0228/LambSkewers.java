package week2.day_0228;

public class LambSkewers {

    public static final int lambSkewersPrice = 12_000;
    public static final int drinkPrice = 2_000;

    public int solution(int n, int k) {
        int answer = 0;
        int serviceDrink = n / 10;

        answer += lambSkewersPrice * n + drinkPrice * k;
        if (serviceDrink != 0) {
            answer -= drinkPrice * serviceDrink;
        }

        return answer;
    }

}
