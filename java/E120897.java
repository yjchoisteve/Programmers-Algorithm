package programmers.java;

import java.util.Scanner;
import java.util.stream.IntStream;

public class E120897 {
    public int[] solution(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).toArray();
    }

    public static void main(String[] args) {
        System.out.println(new E120897());
    }
}
