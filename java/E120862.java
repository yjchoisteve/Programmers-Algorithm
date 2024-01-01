package programmers.java;

import java.util.Scanner;
import java.util.stream.IntStream;

public class E120862 {
    public int solution(int[] numbers) {
        int[] l = IntStream.of(numbers).sorted().toArray();
        return Math.max(l[0] * l[1], l[l.length - 2] * l[l.length - 1]);
    }

    public static void main(String[] args) {
        System.out.println(new E120862());
    }
}
