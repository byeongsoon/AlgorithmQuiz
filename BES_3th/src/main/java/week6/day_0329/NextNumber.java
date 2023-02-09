package week6.day_0329;

public class NextNumber {

    public int solution(int[] common) {
        int metric = 0;

        for (int i = 1, count = 0; i < common.length; i++) {
            int tmp = metric;
            int newMetric = common[i] - common[i-1];

            if (tmp != newMetric) {
                tmp = newMetric;
                count++;
            }

            if (count == 2) {
                metric = tmp / metric;
                return common[common.length - 1] * metric;
            }

            metric = tmp;
        }

        return common[common.length-1] + metric;
    }

    public int otherSolution(int[] common) {
        int x = common[1] - common[0];
        int y = common[2] - common[1];

        if (x == y) {
            return common[common.length - 1] + y;
        }

        return common[common.length - 1] * (common[2] / common[1]);
    }

}
