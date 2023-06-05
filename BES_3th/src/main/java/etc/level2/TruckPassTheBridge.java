package etc.level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TruckPassTheBridge {

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> bridge = new LinkedList<>();
        List<Integer> trucks = new ArrayList<>();

        for (int n : truck_weights) {
            trucks.add(n);
        }

        for (int i = 0; i < bridge_length; i++) {
            bridge.add(0);
        }

        while (true) {
            answer++;
            if (trucks.size() == 0) {
                break;
            }
            bridge.poll();
            if (bridge.stream().mapToInt(Integer::intValue).sum() + waitTruck(trucks) <= weight
                && bridge.size() <= bridge_length) {
                bridge.add(trucks.get(0));
                trucks.remove(0);
                continue;
            }
            bridge.add(0);
        }

        answer += (bridge_length - 1);
        return answer;
    }

    private int waitTruck(List<Integer> trucks) {
        if (trucks.size() > 1) {
            return trucks.get(1);
        }else if (trucks.size() == 1) {
            return trucks.get(0);
        }
        return 0;
    }

    public static void main(String[] args) {
        TruckPassTheBridge test = new TruckPassTheBridge();
        int[] truck = {10};
        System.out.println(test.solution(100,100, truck));
    }

}
