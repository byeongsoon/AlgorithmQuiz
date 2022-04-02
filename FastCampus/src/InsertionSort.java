public class InsertionSort {

    // 삽입 정렬
    public static void insertionSort(int[] arr, int count) {
        int i = 0, j = 0;
        int temp = 0;

        for (i = 1; i < count; i++) {
            temp = arr[i];

            for (j = i; (j>0) && (arr[j-1]>temp); j--) {
                arr[j] = arr[j-1];
            }

            arr[j] = temp;

            System.out.println("반복-" + i);
            printSort(arr,count);
        }
    }

    public static void printSort(int[] arr, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {80, 50, 70, 10, 60, 20, 40, 30};

        insertionSort(arr, arr.length);

    }

}
