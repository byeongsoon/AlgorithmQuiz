package week3.day_0310;

public class AntCorps {

    public int solution(int hp) {
        int answer = 0;
        int temp = hp;
        int index = 0;
        int[] antPower = {5,3,1};

        while (temp > 0) {
            answer += temp / antPower[index];
            temp %= antPower[index++];
        }

        return answer;
    }

}
