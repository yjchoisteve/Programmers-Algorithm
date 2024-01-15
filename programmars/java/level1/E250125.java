package programmars.java.level1;

import java.util.stream.IntStream;

public class E250125 {
        public int solution(String[][] board, int h, int w) {
                int[][] dxdy = { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 } };
                int max = board.length;
                String color = board[h][w];
                IntStream.range(0, 4).mapToObj(i -> new int[] { h + dxdy[i][0], w + dxdy[i][1] })
                                .forEach(e -> System.out.println(e[0] + " , " + e[1]));
                return (int) IntStream.range(0, 4).mapToObj(i -> new int[] { h + dxdy[i][0], w + dxdy[i][1] }).filter(
                                e -> e[0] >= 0 && e[0] < max && e[1] >= 0 && e[1] < max
                                                && board[e[0]][e[1]].equals(color))
                                .count();
        }

        public static void main(String[] args) {
                System.out
                                .println(
                                                new E250125().solution(
                                                                new String[][] { { "blue", "red", "orange", "red" },
                                                                                { "red", "red", "blue", "orange" },
                                                                                { "blue", "orange", "red", "red" },
                                                                                { "orange", "orange", "red", "blue" } },
                                                                0, 1));
        }
}
