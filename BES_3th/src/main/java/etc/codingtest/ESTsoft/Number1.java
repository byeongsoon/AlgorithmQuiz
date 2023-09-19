package etc.codingtest.ESTsoft;

public class Number1 {

    public int solution(int[][] histogram) {
        int answer = 1;

        for (int i = 0; i < histogram[0].length; i++) {
            int numberOfCase = 1;
            int before = 0;

            for (int j = 0; j < histogram.length; j++) {
                if (histogram[j][i] == 0) {
                    if (before == 2) {
                        numberOfCase = 1;
                    }
                    continue;
                }
                if (histogram[j][i] == 1) {
                    break;
                }
                if (histogram[j][i] == 2) {
                    before = 2;
                    numberOfCase++;
                }
            }

            answer *= numberOfCase;
        }

        return answer;
    }

    /* 0은 비어있는 부분, 1은 막대 그래프, 2는 손상 부분
    [0, 0, 0, 0, 0, 0, 1]
    [0, 0, 0, 1, 0, 0, 1]
    [0, 1, 0, 1, 0, 0, 1]
    [1, 1, 2, 2, 1, 0, 1]
    [2, 2, 2, 2, 1, 2, 2]
    [2, 2, 1, 1, 1, 2, 2]
    [2, 2, 1, 1, 1, 2, 2]
 */

    public static void main(String[] args) {
        Number1 t = new Number1();
        int[][] arr = {
            {0, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 1, 0, 0, 1},
            {0, 1, 0, 1, 0, 0, 1},
            {1, 1, 2, 2, 1, 0, 1},
            {2, 2, 2, 2, 1, 2, 2},
            {2, 2, 1, 1, 1, 2, 2},
            {2, 2, 1, 1, 1, 2, 2}
        };
        System.out.println(t.solution(arr));
    }

}

