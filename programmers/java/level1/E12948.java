package programmers.java.level1;

public class E12948 {
    public String solution(String phone_number) {
        return "*".repeat(phone_number.length() - 4) + phone_number.substring(phone_number.length() - 4);
    }

    public static void main(String[] args) {
        System.out.println(new E12948().solution("01033334444"));
        System.out.println(new E12948().solution("027778888"));
    }
}
