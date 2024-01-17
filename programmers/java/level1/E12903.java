package programmers.java.level1;

public class E12903 {
    public String solution(String s) {
        return s.substring(s.length() / 2 - (s.length() % 2 == 0 ? 1 : 0), s.length() / 2 + 1);
    }

    public static void main(String[] args) {
        System.out.println(new E12903().solution("abcde"));
        System.out.println(new E12903().solution("qwer"));
    }
}
