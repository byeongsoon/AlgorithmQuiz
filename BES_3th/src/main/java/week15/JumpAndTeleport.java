package week15;

public class JumpAndTeleport {

    // 주어짓 숫자를 2진수로 변환했을 때, 2진수에서 1의 갯수가 정답
    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 2;
            n /= 2;
        }

        return answer;
    }

}