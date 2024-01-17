package programmers.java.level1;

public class E12954 {
    public long[] solution(int x, int n) {
        long[] ret = new long[n];
        ret[0] = x;
        for (int i = 1; i < n; i++) {
            ret[i] = ret[i - 1] + x;
        }
        return ret;
    }

    public static void main(String[] args) {
        long[] a = new E12954().solution(2, 5);
        for (long i : a) {
            System.out.println(i);
        }
        System.out.println();
        long[] b = new E12954().solution(4, 3);
        for (long i : b) {
            System.out.println(i);
        }
        System.out.println();
        long[] c = new E12954().solution(-4, 2);
        for (long i : c) {
            System.out.println(i);
        }
    }
}
