package week13.day_0517;

import java.util.*;

public class DeclarationResultReport {

    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));
        Map<String, Integer> declaration = new HashMap<>(); // 유저 별로 신고당한 횟수
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
            declaration.put(reportedUser, declaration.getOrDefault(reportedUser,0) + 1);
        }

        // 이용 정지 대상자 색출
        List<String> stopUse = new ArrayList<>();
        for (String s : declaration.keySet()) {
            if (declaration.get(s) >= k) {
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

    public static void main(String[] args) {
//        String[] id_list = {"con", "ryan"};
//        String[] report = {"ryan con","ryan con","ryan con","ryan con"};
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        DeclarationResultReport test = new DeclarationResultReport();
        test.solution(id_list, report, 2);
    }

}
