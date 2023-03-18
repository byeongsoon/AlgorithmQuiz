package week13.day_0515;


public class PressKeypad {

    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int leftHand = 10;
        int rightHand = 12;

        for (int n: numbers) {
            if (isBasicLeftHand(n)) {
                answer.append("L");
                leftHand = n;
                continue;
            } else if (isBasicRightHand(n)) {
                answer.append("R");
                rightHand = n;
                continue;
            }

            if (n == 0) {
                n = 11;
            }
            int leftDistance = calculateDistance(n, leftHand);
            int rightDistance = calculateDistance(n, rightHand);

            if (leftDistance == rightDistance) {
                String h = "right".equals(hand) ? "R" : "L";
                answer.append(h);

                if ("R".equals(h)) {
                    rightHand = n;
                } else {
                    leftHand = n;
                }
                continue;
            } else if (leftDistance < rightDistance) {
                answer.append("L");
                leftHand = n;
                continue;
            }
            answer.append("R");
            rightHand = n;
        }

        return answer.toString();
    }

    private int calculateDistance(int n, int hand) {
        return Math.abs(n - hand) / 3 + Math.abs(n - hand) % 3;
    }

    private boolean isBasicLeftHand(int n) {
        return n == 1 || n == 4 || n == 7;
    }

    private boolean isBasicRightHand(int n) {
        return n == 3 || n == 6 || n == 9;
    }

}
