package programmars.java.level0;

import java.util.Scanner;
import java.util.stream.IntStream;

public class E181831 {
    public int solution(int[][] arr) {
        return IntStream.range(0, arr.length)
                .allMatch(i -> IntStream.range(i + 1, arr.length).allMatch(j -> arr[i][j] == arr[j][i])) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(new E181831().solution(new int[][] { { 5, 192, 33 }, { 192, 72, 95 }, { 33, 95, 999 } }));
        System.out.println(new E181831().solution(new int[][] { { 19, 498, 258, 587 }, { 63, 93, 7, 754 },
                { 258, 7, 1000, 723 }, { 587, 754, 723, 81 } }));
    }
}
