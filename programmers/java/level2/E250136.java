package programmers.java.level2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class E250136 {
    public int solution(int[][] land) {
        int[] arr = new int[land[0].length];
        int max = 0;
        int lenR = land.length, lenC = land[0].length;
        for (int i = 0; i < lenR; i++) {
            for (int j = 0; j < lenC; j++) {
                if (land[i][j] == 0) {
                    continue;
                }
                int result = 1;
                Set<Integer> s = new HashSet<>();
                Queue<int[]> q = new ArrayDeque<>();
                q.add(new int[] { i, j });
                land[i][j] = 0;
                s.add(j);
                while (!q.isEmpty()) {
                    int[] cur = q.poll();
                    int cr = cur[0];
                    int cc = cur[1];
                    for (int dx = -1; dx <= 1; dx++) {
                        for (int dy = -1; dy <= 1; dy++) {
                            if (((dx ^ dy) & 1) != 1) {
                                continue;
                            }
                            int nr = cr + dx;
                            int nc = cc + dy;
                            if (nr < 0 || nr >= lenR || nc < 0 || nc >= lenC || land[nr][nc] == 0) {
                                continue;
                            }
                            result++;
                            land[nr][nc] = 0;
                            s.add(nc);
                            q.add(new int[] { nr, nc });
                        }
                    }
                }
                for (int d : s) {
                    arr[d] += result;
                }
            }
        }
        for (int d : arr) {
            max = Math.max(d, max);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new E250136().solution(new int[][] { { 0, 0, 0, 1, 1, 1, 0, 0 }, { 0, 0, 0, 0, 1, 1, 0, 0 },
                { 1, 1, 0, 0, 0, 1, 1, 0 }, { 1, 1, 1, 0, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0, 1, 1 } }));
        System.out.println();
        System.out.println(
                new E250136().solution(new int[][] { { 1, 0, 1, 0, 1, 1 }, { 1, 0, 1, 0, 0, 0 }, { 1, 0, 1, 0, 0, 1 },
                        { 1, 0, 0, 1, 0, 0 }, { 1, 0, 0, 1, 0, 1 }, { 1, 0, 0, 0, 0, 0 },
                        { 1, 1, 1, 1, 1, 1 } }));
    }
}
