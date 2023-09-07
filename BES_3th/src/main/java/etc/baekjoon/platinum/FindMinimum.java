package etc.baekjoon.platinum;

import java.io.*;
import java.util.*;

public class FindMinimum {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());
        int l = Integer.parseInt(tokenizer.nextToken());

        tokenizer = new StringTokenizer(br.readLine());
        Deque<Node> deque = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int now = Integer.parseInt(tokenizer.nextToken());
            while (!deque.isEmpty() && deque.peekLast().value > now) {
                deque.removeLast();
            }

            deque.addLast(new Node(i, now));

            if (deque.getFirst().index <= i - l) {
                deque.removeFirst();
            }

            bw.write(deque.getFirst().value + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    static class Node {
        int index;
        int value;

        public Node(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }

}
