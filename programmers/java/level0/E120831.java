package programmers.java.level0;

import java.util.Scanner;
import java.util.stream.IntStream;

public class E120831 {
    public int solution(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> i % 2 == 0).sum();
    }

    public static void main(String[] args) {
        System.out.println(new E120831());
    }
}
