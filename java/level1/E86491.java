package programmers.java.level1;

import java.util.Scanner;

public class E86491 {
    public int solution(int[][] sizes) {
        int index = -1, max = 0, max2 = 0;
        for (int i = 0; i < sizes.length; i++) {
            int tmp = Math.max(sizes[i][0], sizes[i][1]);
            if (max == tmp && Math.min(sizes[i][0], sizes[i][1]) < Math.min(sizes[index][0], sizes[index][1])) {
                index = i;
            } else if (max < tmp) {
                index = i;
                max = tmp;
            }
        }
        for (int i = 0; i < sizes.length; i++) {
            if (index == i)
                continue;
            int tmp = Math.min(sizes[i][0], sizes[i][1]);
            if (max2 < tmp) {
                max2 = tmp;
            }
        }
        return max * max2;
    }

    public static void main(String[] args) {
        System.out.println(new E86491());
    }
}
