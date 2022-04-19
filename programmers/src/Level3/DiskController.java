package Level3;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class DiskController {

    public static int solution(int[][] jobs) {
        int answer = 0;
        int totalTime = 0;
        int job = 0;
        int time = 0;

        PriorityQueue<String> jobQueue = new PriorityQueue<>();

        for (int i = 1; i < jobs.length; i++) {
            jobQueue.add(jobs[i][1]+","+jobs[i][0]);
        }

        job = jobs[0][1];
        time = jobs[0][0];

        if (time > totalTime)
            totalTime = time - totalTime;

        totalTime += job;
        answer += (totalTime-time);

        while (jobQueue.size() > 0) {

            String[] arr = jobQueue.poll().split(",");
            job = Integer.parseInt(arr[0]);
            time = Integer.parseInt(arr[1]);

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
