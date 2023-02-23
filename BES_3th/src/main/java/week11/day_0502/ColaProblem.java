package week11.day_0502;

public class ColaProblem {

    /*
    콜라를 받기 위해 마트에 주어야 하는 병 수 a,
    빈 병 a개를 가져다 주면 마트가 주는 콜라 병 수 b,
    상빈이가 가지고 있는 빈 병의 개수 n이 매개변수로 주어집니다.

    상빈이가 받을 수 있는 콜라의 병 수를 return 하도록 solution 함수를 작성해주세요.

    아래와 같이 딱 나누어 떨어지지 않는 값에 대해서 고민해야함
    a   b   n   result
    3   2   10  16
     */

    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            int cola = (n / a) *  b;
            answer += cola;
            n = (n - (a * (n / a))) + cola;
            System.out.println(n);
        }

        return answer;
    }

}
