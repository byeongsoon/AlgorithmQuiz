import java.io.*;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringBuilder p = new StringBuilder();

            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            String[] strings = str.split("");
            for (String s: strings) {
                for (int j=0; j < r; j++) {
                    p.append(s);
                }
            }
            System.out.println(p);
        }

    }
}