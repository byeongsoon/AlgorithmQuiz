package week13.day_0517;

import java.util.*;
import java.util.stream.Collectors;

public class DeclarationResultReport {

    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));
        Map<String, Integer> count = new HashMap<>(); // 유저 별로 신고당한 횟수
        Map<String, List<String>> reportUser = new HashMap<>(); // 유저 ID와 유저가 신고한 ID

        for (String s : reportSet) {
            String[] split = s.split(" ");
            String user = split[0];
            String reportedUser = split[1];

            // 유저 별 신고한 ID 추가
            List<String> list = reportUser.getOrDefault(user, new ArrayList<>());
            list.add(reportedUser);
            reportUser.put(user, list);

            // 신고받은 횟수 추가
            count.put(reportedUser, count.getOrDefault(reportedUser,0) + 1);
        }

        // 이용 정지 대상자 색출
        List<String> stopUse = new ArrayList<>();
        for (String s : count.keySet()) {
            if (count.get(s) >= k) {
                stopUse.add(s);
            }
        }

        // 이용정지 대상자가 유저 별 신고자에 있는지 -> 있다면 1증가
        for (int i = 0; i < id_list.length; i++) {
            List<String> list = reportUser.getOrDefault(id_list[i], new ArrayList<>());
            for (String s : stopUse) {
                if (list.contains(s)) {
                    answer[i]++;
                }
            }
        }

        return answer;
    }

    public int[] otherSolution(String[] id_list, String[] report, int k) {
        List<String> list = Arrays.stream(report).distinct().collect(Collectors.toList());
        HashMap<String, Integer> count = new HashMap<>();
        for (String s : list) {
            String target = s.split(" ")[1];
            count.put(target, count.getOrDefault(target, 0) + 1);
        }

        return Arrays.stream(id_list).map(_user -> {
            final String user = _user;
            List<String> reportList = list.stream().filter(s -> s.startsWith(user + " ")).collect(Collectors.toList());
            return reportList.stream().filter(s -> count.getOrDefault(s.split(" ")[1], 0) >= k).count();
        }).mapToInt(Long::intValue).toArray();
    }

}
