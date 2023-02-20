package week10.day_0426;

public class MinimalRectangle {

    public int solution(int[][] sizes) {
        int[][] optimization = sizes.clone();
        int widthMax = 0, heightMax = 0;

        for (int i = 0; i < optimization.length; i++) {
            if (optimization[i][0] < optimization[i][1]) {
                int temp = optimization[i][0];
                optimization[i][0] = optimization[i][1];
                optimization[i][1] = temp;
            }
        }

        for (int[] arr: optimization) {
            if (widthMax < arr[0]) {
                widthMax = arr[0];
            }
            if (heightMax < arr[1]) {
                heightMax = arr[1];
            }
        }


        return widthMax * heightMax;
    }

    public int otherSolution(int[][] sizes) {
        int width = 0, height = 0;

        for (int[] card: sizes) {
            width = Math.max(width, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }

        return width * height;
    }

}
