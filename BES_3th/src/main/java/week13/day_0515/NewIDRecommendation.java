package week13.day_0515;

public class NewIDRecommendation {

    public String solution(String new_id) {
        return stepSeven(stepSix(stepFive(stepFour(stepThree(stepTwo(stepOne(new_id)))))));
    }

    private String stepOne(String id) {
        return id.toLowerCase();
    }

    private String stepTwo(String id) {
        return id.replaceAll("[^a-z0-9-_.]","");
    }

    private String stepThree(String id) {
        while (id.contains("..")) {
            id = id.replaceAll("[.]{2,}", ".");
        }

        return id;
    }

    private String stepFour(String id) {
        if (!id.isEmpty() && '.' == id.charAt(0)) {
            id = id.replaceFirst(".","");
        }
        if (!id.isEmpty() && '.' == id.charAt(id.length() - 1)) {
            id = id.substring(0, id.length() - 1);
        }

        return id;
    }

    private String stepFive(String id) {
        if (id.isEmpty()) {
            return "a";
        }

        return id;
    }

    private String stepSix(String id) {
        if (id.length() >= 16) {
            return stepFour(id.substring(0,15));
        }

        return id;
    }

    private String stepSeven(String id) {
        if (id.length() <= 2) {
            while (id.length() < 3) {
                id += id.charAt(id.length() - 1);
            }

            return id;
        }

        return id;
    }

}
