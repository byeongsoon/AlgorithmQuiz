public class BinarySearchProblem {

    public static void main(String[] args) {

        int[] numbers = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};

        int target = 95;
        int left = 0;
        int right = numbers.length - 1;
        int mid = (left+right) / 2;

        boolean flag = false;

        while (left <= right) {
            if (numbers[mid] == target) {
                flag = true;
                break;
            } else if (numbers[mid] < target) { // 찾으려는 수가 더 큰 경우
                left = mid + 1;
            } else {
                right = mid - 1;
            }

            mid = (left+right)/2;
        }

        if (flag) {
            System.out.println("찾으려는 값 " + target + "은 " + (mid+1) + "번째에 있습니다.");
        } else {
            System.out.println("찾으려는 값이 없습니다.");
        }

    }

}
