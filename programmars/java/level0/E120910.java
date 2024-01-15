package programmars.java.level0;

import java.util.Scanner;
import java.util.stream.IntStream;

public class E120910 {
    public int solution(int n, int t) {
        return IntStream.rangeClosed(1, t).reduce(n, (current, next) -> current * 2);
    }

    public static void main(String[] args) {
        System.out.println(new E120910());
    }
}
