package week9.day_0420;

import java.util.Scanner;

public class PrintStar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int height = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }

}
