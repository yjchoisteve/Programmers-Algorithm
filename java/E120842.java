package programmers.java;

import java.util.Scanner;
import java.util.stream.IntStream;

public class E120842 {
    public int[][] solution(int[] num_list, int n) {
        return IntStream.range(0, num_list.length / n)
                .mapToObj(i -> IntStream.range(0, n).map(j -> num_list[i * n + j]).toArray()).toArray(int[][]::new);
    }

    public static void main(String[] args) {
        System.out.println(new E120842());
    }
}
