package programmers.java;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class E181838 {
    public int solution(int[] date1, int[] date2) {
        return IntStream.of(date1).mapToObj(i -> String.format("%03d", i)).collect(Collectors.joining("-")).compareTo(
                IntStream.of(date2).mapToObj(i -> String.format("%03d", i)).collect(Collectors.joining("-"))) < 0 ? 1
                        : 0;
    }

    public static void main(String[] args) {
        System.out.println(new E181838().solution(new int[] { 2021, 12, 28 }, new int[] { 2021, 12, 29 }));
        System.out.println(new E181838().solution(new int[] { 1024, 10, 24 }, new int[] { 1024, 10, 24 }));
    }
}
