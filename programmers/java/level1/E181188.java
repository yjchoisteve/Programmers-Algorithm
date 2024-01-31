package programmers.java.level1;

import java.util.Arrays;

public class E181188 {
    public int solution(int[][] targets) {
        int ret = 0;
        Arrays.sort(targets, (n1, n2) -> n1[1] - n2[1]);
        int l = -1;
        for (int[] target : targets) {
            if (l == -1) {
                ret++;
                l = target[1] - 1;
                continue;
            }
            if (l >= target[0] && l <= target[1]) {
                continue;
            }
            ret++;
            l = target[1] - 1;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new E181188()
                .solution(new int[][] { { 4, 5 }, { 4, 8 }, { 10, 14 }, { 11, 13 }, { 5, 12 }, { 3, 7 }, { 1, 4 } }));
    }
}
