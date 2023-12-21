package programmers.java;

import java.util.Scanner;
import java.util.stream.IntStream;

public class E181829 {
    public int solution(int[][] board, int k) {
        return IntStream.range(0, board.length)
                .map(i -> IntStream.range(0, board[i].length).map(j -> i + j <= k ? board[i][j] : 0).sum()).sum();
    }

    public static void main(String[] args) {
        System.out
                .println(new E181829().solution(new int[][] { { 0, 1, 2 }, { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5 } }, 2));
    }
}
