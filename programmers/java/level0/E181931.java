package programmers.java.level0;

import java.util.Scanner;
import java.util.stream.IntStream;

public class E181931 {
    public int solution(int a, int d, boolean[] included) {
        return IntStream.range(0, included.length).map(i -> included[i] ? a + d * i : 0).sum();
    }

    public static void main(String[] args) {
        System.out.println(new E181931().solution(3, 4, new boolean[] { true, false, false, true, true }));
        System.out.println(
                new E181931().solution(7, 1, new boolean[] { false, false, false, true, false, false, false }));
    }
}
