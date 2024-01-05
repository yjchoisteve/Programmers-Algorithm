package programmers.java.level0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class E181867 {
    public int[] solution(String myString) {
        return Arrays.stream(myString.split("x", -1)).mapToInt(String::length).toArray();
    }

    public static void main(String[] args) {
        IntStream.of(new E181867().solution("oxooxoxxox")).forEach(x -> System.out.print(x + ","));
        System.out.println();
        IntStream.of(new E181867().solution("xabcxdefxghi")).forEach(x -> System.out.print(x + ","));
    }
}
