package programmers.java.level1;

public class E12918 {
    public boolean solution(String s) {
        try {
            Integer.parseInt(s);
            return s.length() == 4 || s.length() == 6;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(new E12918().solution("a234"));
        System.out.println(new E12918().solution("1234"));
    }
}
