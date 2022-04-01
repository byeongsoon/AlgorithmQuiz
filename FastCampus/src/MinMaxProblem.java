public class MinMaxProblem {

    // 나열된 수에서 최솟값과 최댓값 구하고 그 위치를 반환하라, 반복문은 한번만 사용
    public static void main(String[] args) {

        int[] numbers = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};

        int min = numbers[0];
        int max = numbers[0];
        int minIndex = 0;
        int maxIndex = 0;

        for (int i=1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i+1;
            }
            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i+1;
            }
        }

        System.out.println("최댓값은 " + max + "이며, " + maxIndex + "번째에 있습니다.");
        System.out.println("최솟값은 " + min + "이며, " + minIndex + "번째에 있습니다.");

    }

}
