package etc.baekjoon.silver;

import java.io.*;
import java.util.StringTokenizer;

public class FindSumOfInterval {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());
        int count = Integer.parseInt(tokenizer.nextToken());

        int[] sum = new int[n+1];
        tokenizer = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i-1] + Integer.parseInt(tokenizer.nextToken());
        }

        for (int i = 0; i < count; i++) {
            tokenizer = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(tokenizer.nextToken());
            int end = Integer.parseInt(tokenizer.nextToken());

            bw.write(String.valueOf(sum[end] - sum[start - 1]) + "\n");
        }

        bw.close();
    }

}