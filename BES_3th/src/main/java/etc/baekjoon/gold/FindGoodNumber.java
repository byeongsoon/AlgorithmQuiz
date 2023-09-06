package etc.baekjoon.gold;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FindGoodNumber {

    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
        }

        Arrays.sort(arr);
        for (int k = 0; k < n; k++) {
            step(arr, k);
        }

        bw.write(String.valueOf(answer) + "\n");
        br.close();
        bw.close();
    }

    private static void step(int[] arr, int k) {
        long find = arr[k];
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (i == k) {
                i++;
                continue;
            } else if (j == k) {
                j--;
                continue;
            }

            if (arr[i] + arr[j] == find) {
                answer++;
                break;
            } else if (arr[i] + arr[j] < find) {
                i++;
            } else {
                j--;
            }
        }
    }

}
