package programmers.java.level0;

import java.util.Scanner;
import java.util.stream.IntStream;

public class E120909 {
    public int solution(int n) {
        return IntStream.rangeClosed(1, 1000).map(i -> i * i).filter(i -> i == n).count() == 1 ? 1 : 2;
    }

    public static void main(String[] args) {
        System.out.println(new E120909());
    }
}
