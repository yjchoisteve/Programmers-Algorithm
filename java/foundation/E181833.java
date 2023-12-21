package programmers.java;

import java.util.stream.IntStream;

public class E181833 {
    public int[][] solution(int n) {
        return IntStream.range(0, n)
                .mapToObj(i -> IntStream.range(0, n).map(j -> j == i ? 1 : 0).toArray())
                .toArray(int[][]::new);
    }

    public static void main(String[] args) {
        int[][] a = new E181833().solution(3);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
