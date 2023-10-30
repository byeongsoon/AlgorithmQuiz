package etc.codility;

public class MaximumValueAfterRemoving5 {

    public int solution(int N) {
        int sign = N >= 0 ? 1 : -1;

        N = sign * N;
        String numStr = String.valueOf(N);
        int n = numStr.length();
        int deleteIdx = -1;

        for(int i = 0; i < n; i++) {
            char c = numStr.charAt(i);
            if(c == '5') {
                deleteIdx = i;
                if(sign == 1 && i + 1 < n && numStr.charAt(i + 1) > '5') {
                    break;
                } else if(sign == -1 && i + 1 < n && numStr.charAt(i + 1) < '5') {
                    break;
                }
            }
        }

        return sign * Integer.parseInt(numStr.substring(0, deleteIdx) + numStr.substring(deleteIdx + 1));
    }

}
