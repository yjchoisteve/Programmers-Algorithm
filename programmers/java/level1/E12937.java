package programmers.java.level1;

public class E12937 {
    public String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        System.out.println(new E12937().solution(3));
        System.out.println(new E12937().solution(4));
    }
}
