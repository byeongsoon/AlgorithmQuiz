package etc.level2;

import java.util.*;

public class CalculateParkingFee {

    public int[] solution(int[] fees, String[] records) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> totalTime = new HashMap<>();
        Map<String, String> recordMap = new HashMap<>();

        for (String record: records) {
            calculateParkingTime(record, totalTime, recordMap);
        }

        List<String> recordMapKeySet = new ArrayList<>(recordMap.keySet());
        for (String s: recordMapKeySet) {
            calculateLeftoverParkingTime(s, totalTime, recordMap);
        }

        List<String> keySet = new ArrayList<>(totalTime.keySet());
        Collections.sort(keySet);

        for (String s: keySet) {
            answer.add(calculateFee(fees, totalTime.get(s)));
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private int calculateFee(int[] fees, int minute) {
        int fee = 0;

        if (minute <= fees[0]) {
            return fees[1];
        }

        fee += fees[1] + ((minute - fees[0]) / fees[2]) * fees[3];
        if ((minute - fees[0]) % fees[2] != 0) {
            fee += fees[3];
        }

        return fee;
    }

    private void calculateLeftoverParkingTime(String carNumber, Map<String, Integer> totalTime, Map<String, String> recordMap) {
        int parkingTime = getMinute(recordMap.get(carNumber),"23:59");
        recordMap.remove(carNumber);

        totalTime.put(carNumber, totalTime.getOrDefault(carNumber, 0) + parkingTime);
    }

    private void calculateParkingTime(String record, Map<String, Integer> totalTime, Map<String, String> recordMap) {
        String[] splits = record.split(" ");
        if ("IN".equals(splits[2])) {
            recordMap.put(splits[1], splits[0]);
            return;
        }

        int parkingTime = getMinute(recordMap.get(splits[1]), splits[0]);
        recordMap.remove(splits[1]);

        totalTime.put(splits[1], totalTime.getOrDefault(splits[1],0) + parkingTime);
    }

    private int getMinute(String start, String end) {
        int result = 0;
        String[] startTime = start.split(":");
        String[] endTime = end.split(":");

        int hour = Integer.parseInt(endTime[0]) - Integer.parseInt(startTime[0]);
        int minute = Integer.parseInt(endTime[1]) - Integer.parseInt(startTime[1]);

        if (minute < 0) {
            hour--;
            minute += 60;
        }

        if (hour > 0) {
            result += hour * 60;
        }

        return result + minute;
    }

    public static void main(String[] args) {
        CalculateParkingFee test = new CalculateParkingFee();
        int[] fees = {180, 5000, 10, 600};
        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};

        int[] results = test.solution(fees, records);
        for (int n: results) {
            System.out.println(n);
        }
    }

}
