package programmers.java.level1;

public class E12912 {
    public long solution(int a, int b) {
        int min = Math.min(a, b), max = Math.max(a, b);
        long ret = 0;
        for (int i = min; i <= max; i++) {
            ret += i;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new E12912().solution(3, 5));
        System.out.println(new E12912().solution(3, 3));
        System.out.println(new E12912().solution(5, 3));
    }
}
