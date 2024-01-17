package programmers.java.level1;

public class E12940 {
    public int[] solution(int n, int m) {
        int max = Math.max(n, m), min = Math.min(n, m);
        int gcd = 0, lcm = 0;
        if (max % min == 0) {
            gcd = min;
            lcm = max;
        }
        if (gcd == 0) {
            gcd = calcGcd(n, m);
            lcm = m / gcd * n;
        }
        return new int[] { gcd, lcm };
    }

    public int calcGcd(int a, int b) {
        if (b == 0)
            return a;
        return calcGcd(b, a % b);
    }

    public static void main(String[] args) {
        int[] a = new E12940().solution(3, 12);
        for (int i : a) {
            System.out.println(i);
        }
        System.out.println();
        int[] b = new E12940().solution(2, 5);
        for (int i : b) {
            System.out.println(i);
        }
    }
}
