package programmers.java.level1;

public class E70128 {
    public int solution(int[] a, int[] b) {
        int ret = 0;
        for (int i = 0; i < a.length; i++) {
            ret += a[i] * b[i];
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new E70128());
    }
}
