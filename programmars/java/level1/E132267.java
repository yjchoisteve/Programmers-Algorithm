package programmars.java.level1;

public class E132267 {
    public int solution(int a, int b, int n) {
        int count = 0;
        while (n / a > 0) {
            int tmp = n / a;
            count += tmp * b;
            n = n - tmp * a + tmp * b;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new E132267().solution(2, 1, 20));
        System.out.println(new E132267().solution(3, 1, 20));
    }
}
