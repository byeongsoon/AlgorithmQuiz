package week3.day_0308;

public class IceAmericano {

    final static int AMERICANO_PRICE = 5_500;

    public int[] solution(int money) {
        int[] answer = new int[2];

        answer[0] = money / AMERICANO_PRICE;
        answer[1] = money % AMERICANO_PRICE;

        return answer;
    }

}
