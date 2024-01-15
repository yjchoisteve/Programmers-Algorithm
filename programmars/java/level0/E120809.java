package programmars.java.level0;

import java.util.Scanner;
import java.util.stream.IntStream;

public class E120809 {
    public int[] solution(int[] numbers) {
        return IntStream.of(numbers).map(n -> n * 2).toArray();
    }

    public static void main(String[] args) {
        System.out.println(new E120809());
    }
}
