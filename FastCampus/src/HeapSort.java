public class HeapSort {

    private int SIZE;
    private int[] heapArr;

    HeapSort() {
        SIZE = 0;
        heapArr = new int[50];
    }

    public int getSIZE() {
        return SIZE;
    }

    public void insertHeap(int input) {
        int i = ++SIZE;

        while (input < heapArr[i/2]) { // Min Heap
        // while (input > heapArr[i/2]) { // Max Heap
            heapArr[i] = heapArr[i/2];
            i /= 2;
        }
        heapArr[i] = input;
    }

    public int deleteHeap() {
        int parent, child;
        int data, temp;

        data = heapArr[1];
        temp = heapArr[SIZE];
        SIZE--;

        parent = 1;
        child = 2;

        while (child <= SIZE) {
//            if ((child < SIZE) && (heapArr[child] < heapArr[child+1])) { // Max Heap
            if ((child < SIZE) && (heapArr[child] > heapArr[child+1])) { // Min Heap
                child++;
            }
//            if (temp >= heapArr[child]) break; // Max Heap
            if (temp <= heapArr[child]) break; // Min Heap

            heapArr[parent] = heapArr[child];
            parent = child;
            child *= 2;
        }

        heapArr[parent] = temp;
        return data;
    }

    public void printHeap() {
        System.out.println("MIN Heap");
//        System.out.println("MAX Heap");
        for (int i = 1; i <= SIZE; i++) {
            System.out.printf("[%d] ", heapArr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        HeapSort heapSort = new HeapSort();

        heapSort.insertHeap(80);
        heapSort.insertHeap(50);
        heapSort.insertHeap(70);
        heapSort.insertHeap(20);
        heapSort.insertHeap(10);
        heapSort.insertHeap(60);

        heapSort.printHeap();

        int n, data;

        n = heapSort.getSIZE();
        for (int i = 1; i <= n; i++) {
            data = heapSort.deleteHeap();
            System.out.printf("\n 출력 : [%d]", data);
        }

    }

}
