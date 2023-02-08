package week6.day_0327;

public class LoginSuccess {

    public String solution(String[] id_pw, String[][] db) {
        for (int i = 0; i < db.length; i++) {
            if (db[i][0].equals(id_pw[0])) {
                return db[i][1].equals(id_pw[1]) ? "login" : "wrong pw";
            }
        }

        return "fail";
    }

}
