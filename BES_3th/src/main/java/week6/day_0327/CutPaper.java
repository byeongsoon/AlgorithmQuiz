package week6.day_0327;

public class CutPaper {

    // 종이가 잘리는 것을 잘 따져보면 아래와 같은 수식을 얻을 수 있다.
    public int solution(int M, int N) {
        return (M-1) + ((N-1) * M);
    }

}
