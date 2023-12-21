package programmers.java;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class E181898 {
    public int solution(int[] arr, int idx) {
        int ret = IntStream.of(arr).skip(idx).boxed().collect(Collectors.toList()).indexOf(1);
        return ret == -1 ? -1 : ret + idx;
    }

    public static void main(String[] args) {
        System.out.println(new E181898().solution(new int[] { 0, 0, 0, 1 }, 1));
        System.out.println(new E181898().solution(new int[] { 1, 0, 0, 1, 0, 0 }, 4));
        System.out.println(new E181898().solution(new int[] { 1, 1, 1, 1, 0 }, 3));
    }
}
