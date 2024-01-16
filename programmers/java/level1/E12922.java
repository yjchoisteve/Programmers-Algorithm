package programmers.java.level1;

public class E12922 {
    public String solution(int n) {
        return "수박".repeat((n % 2 == 1 ? n + 1 : n) / 2).substring(0, n);
    }

    public static void main(String[] args) {
        System.out.println(new E12922().solution(3));
        System.out.println(new E12922().solution(4));
    }
}
