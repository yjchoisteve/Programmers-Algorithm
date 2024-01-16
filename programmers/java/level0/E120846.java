package programmers.java.level0;

import java.util.Scanner;
import java.util.stream.IntStream;

public class E120846 {
    public int solution(int n) {
        return (int) IntStream.rangeClosed(4, n)
                .filter(i -> IntStream.rangeClosed(1, i).filter(j -> i % j == 0).count() > 2).count();
    }

    public static void main(String[] args) {
        System.out.println(new E120846());
    }
}
