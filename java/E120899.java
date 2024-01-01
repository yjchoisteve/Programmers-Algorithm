package programmers.java;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class E120899 {
    public int[] solution(int[] array) {
        int m = IntStream.of(array).max().getAsInt();
        return new int[] { m, IntStream.of(array).boxed().collect(Collectors.toList()).indexOf(m) };
    }

    public static void main(String[] args) {
        System.out.println(new E120899());
    }
}
