package programmers.java.level1;

public class E12928 {
    public int solution(int n) {
        int ret = n > 2 ? 1 + n : n == 2 || n == 1 ? 1 : 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                ret += i;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new E12928().solution(12));
        System.out.println(new E12928().solution(5));
    }
}
