package programmers.java;

public class E120878 {
    public int solution(int a, int b) {
        int max = Math.min(a, b);
        for (int i = max; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                b /= i;
                break;
            }
        }
        while (true) {
            if (b % 2 == 0) {
                b /= 2;
            } else if (b % 5 == 0) {
                b /= 5;
            } else if (b == 1) {
                return 1;
            } else {
                return 2;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new E120878().solution(7, 20));
        System.out.println(new E120878().solution(11, 22));
        System.out.println(new E120878().solution(12, 21));
    }
}
