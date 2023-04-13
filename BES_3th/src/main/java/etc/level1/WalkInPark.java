package etc.level1;

public class WalkInPark {

    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];

        for (int i = 0; i < park.length; i++) {
            if (park[i].contains("S")) {
                answer[0] = i;
                answer[1] = park[i].indexOf("S");
                break;
            }
        }

        for (String route : routes) {
            moveRoute(route, park, answer);
        }

        return answer;
    }

    private void moveRoute(final String route, final String[] park, final int[] answer) {
        String[] split = route.split(" ");
        String direction = split[0];
        int weight = Integer.parseInt(split[1]);

        boolean flag = true;
        if ("N".equals(direction) && answer[0] - weight >= 0) {
            for (int i = answer[0] - 1; i >= answer[0] - weight; i--) {
                if (park[i].charAt(answer[1]) == 'X') {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                answer[0] -= weight;
            }
        } else if ("S".equals(direction) && answer[0] + weight < park.length) {
            for (int i = answer[0] + 1; i <= answer[0] + weight; i++) {
                if (park[i].charAt(answer[1]) == 'X') {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                answer[0] += weight;
            }
        } else if ("W".equals(direction) && answer[1] - weight >= 0) {
            for (int i = answer[1] - 1; i >= answer[1] - weight; i--) {
                if (park[answer[0]].charAt(i) == 'X') {
                    flag = false;
                    break;
                }
            }
            if (flag) {
            answer[1] -= weight;
            }
        } else if("E".equals(direction) && answer[1] + weight < park[0].length()){ // "E"
            for (int i = answer[1] + 1; i <= answer[1] + weight; i++) {
                if (park[answer[0]].charAt(i) == 'X') {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                answer[1] += weight;
            }
        }
    }

}
