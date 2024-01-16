package programmers.java.level1;

public class E12921 {
    public int solution(int n) {
        int ret = n - 1;
        for (int m = 2; m <= n; m++) {
            for (int i = 2; i * i <= m; i++) {
                if (m % i == 0) {
                    ret--;
                    break;
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new E12921().solution(10));
        System.out.println(new E12921().solution(5));
    }
}
