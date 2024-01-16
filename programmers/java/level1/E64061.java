package programmers.java.level1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class E64061 {
    public int solution(int[][] board, int[] moves) {
        int ret = 0;
        List<Stack<Integer>> l = new ArrayList<>();
        Stack<Integer> basket = new Stack<>();
        for (int j = 0; j < board.length; j++) {
            Stack<Integer> s = new Stack<>();
            for (int i = board.length - 1; i >= 0; i--) {
                if (board[i][j] != 0) {
                    s.push(board[i][j]);
                }
            }
            l.add(s);
        }
        for (int move : moves) {
            if (!l.get(move - 1).empty()) {
                int target = l.get(move - 1).pop();
                if (!basket.isEmpty() && target == basket.peek()) {
                    ret++;
                    basket.pop();
                } else {
                    basket.push(target);
                }
            }
        }
        return ret * 2;
    }

    public static void main(String[] args) {
        System.out
                .println(
                        new E64061()
                                .solution(
                                        new int[][] { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 },
                                                { 4, 2, 4, 4, 2 }, { 3, 5, 1, 3, 1 } },
                                        new int[] { 1, 5, 3, 5, 1, 2, 1, 4 }));
    }
}
