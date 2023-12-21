package programmers.java;

import java.util.Scanner;
import java.util.stream.IntStream;

public class E181883 {
    public int[] solution(int[] arr, int[][] queries) {
        return IntStream.range(0, arr.length).map(i -> arr[i]
                + IntStream.range(0, queries.length).map(j -> i >= queries[j][0] && i <= queries[j][1] ? 1 : 0).sum())
                .toArray();
    }

    public static void main(String[] args) {
        for (int solution : new E181883().solution(new int[] { 0, 1, 2, 3, 4 },
                new int[][] { { 0, 1 }, { 1, 2 }, { 2, 3 } })) {
            System.out.println(solution);
        }
    }
}
