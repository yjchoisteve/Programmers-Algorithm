package programmers.java.level0;

import java.util.Scanner;
import java.util.stream.IntStream;

public class E120905 {
    public int[] solution(int n, int[] numlist) {
        return IntStream.of(numlist).filter(i -> i % n == 0).toArray();
    }

    public static void main(String[] args) {
        System.out.println(new E120905());
    }
}
