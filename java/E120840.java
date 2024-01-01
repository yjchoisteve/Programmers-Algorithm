package programmers.java;

import java.util.Scanner;
import java.util.stream.IntStream;

public class E120840 {
    public int solution(int balls, int share) {
        return comb(balls, share);
    }

    public int comb(int b, int s) {
        if (b == s || s == 0)
            return 1;
        return comb(b - 1, s - 1) + comb(b - 1, s);
    }

    public static void main(String[] args) {
        System.out.println(new E120840().solution(5, 3));
    }
}
