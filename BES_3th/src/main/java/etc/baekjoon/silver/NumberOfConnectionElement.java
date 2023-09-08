package etc.baekjoon.silver;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class NumberOfConnectionElement {

    static ArrayList<Integer>[] listArr;

    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());

        listArr = new ArrayList[n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            listArr[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            tokenizer = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(tokenizer.nextToken());
            int end = Integer.parseInt(tokenizer.nextToken());

            listArr[start - 1].add(end - 1);
            listArr[end - 1].add(start - 1);
        }

        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                answer++;
                dfs(i);
            }
        }

        bw.write(String.valueOf(answer) + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    private static void dfs(int v) {
        if (visited[v]) {
            return;
        }

        visited[v] = true;
        for (int i: listArr[v]) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }

}
