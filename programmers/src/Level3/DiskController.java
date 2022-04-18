package Level3;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class DiskController {

    public static int solution(int[][] jobs) {
        int answer = 0;
        int totalTime = 0;

        PriorityQueue<String> jobQueue = new PriorityQueue<>();

        for (int[] arr: jobs)
            jobQueue.add(arr[1]+","+arr[0]);

        while (jobQueue.size() > 0) {

            String[] arr = jobQueue.poll().split(",");
            int job = Integer.parseInt(arr[0]);
            int time = Integer.parseInt(arr[1]);

            if (time > totalTime)
                totalTime = time - totalTime;

            totalTime += job;
            answer += (totalTime-time);
        }


        return answer/jobs.length;
    }

    public static void main(String[] args) {
        int[][] jobs = {{0,3}, {1,9}, {2,6}};
        System.out.println(solution(jobs));
    }

}
