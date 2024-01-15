package programmars.java.level0;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class E120866 {
    public int solution(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    for (int k = -1; k <= 1; k++) {
                        for (int l = -1; l <= 1; l++) {
                            if (i + k >= 0 && j + l >= 0 && i + k < board.length && j + l < board.length
                                    && board[i + k][j + l] == 0)
                                board[i + k][j + l] = 2;
                        }
                    }
                }
            }
        }
        return Stream.of(board).mapToInt(e -> (int) IntStream.of(e).filter(i -> i == 0).count()).sum();
    }

    public static void main(String[] args) {
        System.out.println(new E120866());
    }
}
