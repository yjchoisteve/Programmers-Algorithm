package programmers.java.level1;

public class E12934 {
    public long solution(long n) {
        double t = Math.sqrt(n);
        if (t == (int) t) {
            return (int) ((t + 1) * (t + 1));
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new E12934().solution(121));
        System.out.println(new E12934().solution(3));
    }
}
