package programmers.java;

import java.util.Scanner;
import java.util.stream.IntStream;

public class E120583 {
    public int solution(int[] array, int n) {
        return (int) IntStream.of(array).filter(i -> i == n).count();
    }

    public static void main(String[] args) {
        System.out.println(new E120583());
    }
}
