package programmars.java.level0;

import java.util.Scanner;
import java.util.stream.IntStream;

public class E120811 {
    public int solution(int[] array) {
        return IntStream.of(array).sorted().toArray()[array.length / 2];
    }

    public static void main(String[] args) {
        System.out.println(new E120811());
    }
}
