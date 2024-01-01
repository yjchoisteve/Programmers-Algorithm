package programmers.java;

import java.util.Scanner;
import java.util.stream.IntStream;

public class E120923 {
    public int[] solution(int num, int total) {
        int start = (int) Math.ceil((double) total / num) - num / 2;
        return IntStream.rangeClosed(start, start + num - 1).toArray();
    }

    public static void main(String[] args) {
        System.out.println(new E120923());
    }
}
