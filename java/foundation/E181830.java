package programmers.java;

import java.util.stream.IntStream;

public class E181830 {
    public int[][] solution(int[][] arr) {
        int l = Math.max(arr.length, arr[0].length);
        return IntStream.range(0, l)
                .mapToObj(i -> IntStream.range(0, l).map(j -> i < arr.length ? j < arr[i].length ? arr[i][j] : 0 : 0)
                        .toArray())
                .toArray(int[][]::new);
    }

    public static void main(String[] args) {
        System.out.println(new E181830());
    }
}
