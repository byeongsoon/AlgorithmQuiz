package week6.day_0329;


public class MaxFrequency {

    public int solution(int[] array) {
        if (array.length == 1) {
            return array[0];
        }

        int[] counts = countNumber(array);
        return maxCount(counts);
    }

    private int maxCount(int[] counts) {
        int answer = 0;
        int max = 0;
        for (final int count : counts) {
            if (max < count) {
                max = count;
            }
        }

        int maxCount = 0;
        for (int i = 0; i < counts.length; i++) {
            if (max == counts[i]) {
                maxCount++;
                answer = i;
            }
            if (maxCount >= 2) {
                return -1;
            }
        }

        return answer;
    }

    private int[] countNumber(int[] array) {
        int[] counts = new int[1000];
        for (int n: array) {
            counts[n]++;
        }
        return counts;
    }

}
