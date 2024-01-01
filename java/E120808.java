package programmers.java;

import java.math.BigInteger;

public class E120808 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        BigInteger n1 = new BigInteger(String.valueOf(denom1));
        BigInteger n2 = new BigInteger(String.valueOf(denom2));
        int lcm = n1.multiply(n2).abs().divide(n1.gcd(n2)).intValue();
        int c = numer1 * lcm / denom1 + numer2 * lcm / denom2;
        int gcd = new BigInteger(String.valueOf(c)).gcd(new BigInteger(String.valueOf(lcm))).intValue();
        return new int[] { c / gcd, lcm / gcd };
    }

    public static void main(String[] args) {
        System.out.println(new E120808().solution(1, 2, 3, 4));
    }
}
