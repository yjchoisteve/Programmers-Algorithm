package programmers.java;

import java.util.Scanner;
import java.util.stream.IntStream;

public class E120817 {
    public double solution(int[] numbers) {
        return IntStream.of(numbers).mapToDouble(i -> i).average().getAsDouble();
    }

    public static void main(String[] args) {
        System.out.println(new E120817());
    }
}
