package week8.day_0411;

public class CoverPhoneNumber {

    public String solution(String phone_number) {
        int size = phone_number.length();
        String number = phone_number.substring(size-4, size);

        return "*".repeat(size-4).concat(number);
    }

}
