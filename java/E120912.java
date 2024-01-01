package programmers.java;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class E120912 {
    public int solution(int[] array) {
        StringBuilder sb = new StringBuilder();
        IntStream.of(array).forEach(i -> sb.append(i));
        return (int) Stream.of(sb.toString().split("")).filter(s -> s.equals("7")).count();
    }

    public static void main(String[] args) {
        System.out.println(new E120912().solution(new int[] { 7, 77, 17 }));
        System.out.println(new E120912().solution(new int[] { 10, 29 }));
    }
}
