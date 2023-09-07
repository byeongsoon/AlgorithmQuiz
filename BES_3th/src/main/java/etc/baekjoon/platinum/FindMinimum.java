package etc.baekjoon.platinum;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class FindMinimum {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());
        int l = Integer.parseInt(tokenizer.nextToken());

        tokenizer = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
        }

        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int [] copyArr;
            if (i - l + 1 >= 0) {
                copyArr = Arrays.copyOfRange(arr, i - l + 1, i + 1);
            } else {
                copyArr = Arrays.copyOfRange(arr, 0, i + 1);
            }
            answer.add(getMinimum(copyArr));
        }

        for (int m: answer){
            bw.write(String.valueOf(m) + " ");
        }

        br.close();
        bw.close();
    }

    private static int getMinimum(int[] arr) {
        int minimum = Integer.MAX_VALUE;

        for (int n: arr) {
            if (n < minimum) {
                minimum = n;
            }
        }

        return minimum;
    }

}
