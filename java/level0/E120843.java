package programmers.java.level0;

import java.util.Scanner;
import java.util.stream.IntStream;

public class E120843 {
    public int solution(int[] numbers, int k) {
        return numbers[(k - 1) * 2 % numbers.length];
    }

    public static void main(String[] args) {
        System.out.println(new E120843());
    }
}
