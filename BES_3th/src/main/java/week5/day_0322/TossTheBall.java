package week5.day_0322;

public class TossTheBall {

    public int solution(int[] numbers, int k) {
        int size = numbers.length;
        int index = -2;

        for (int i = 0; i < k; i++) {
            index += 2;
            if (index > size - 1) {
                index -= size;
            }

        }

        return numbers[index];
    }

}
