package week4.day_0316;

public class Game369 {

    public int solution(int order) {
        int answer = 0;
        String orderString = String.valueOf(order);
        String[] orderArray = orderString.split("");

        for (String s: orderArray) {
            int n = Integer.parseInt(s);
            if (n == 0) {
                continue;
            }
            if (n % 3 == 0) {
                answer++;
            }
        }

        return answer;
    }

}
