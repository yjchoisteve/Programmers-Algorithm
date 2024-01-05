package programmers.java.level0;

import java.util.Scanner;

public class E181832 {
    public int[][] solution(int n) {
        int[][] ret = new int[n][n];
        int s = 1, t = 0, b = n - 1, l = 0, r = n - 1;
        while (s <= n * n) {
            for (int i = l; i <= r; i++)
                ret[t][i] = s++;
            t++;
            for (int i = t; i <= b; i++)
                ret[i][r] = s++;
            r--;
            for (int i = r; i >= l; i--)
                ret[b][i] = s++;
            b--;
            for (int i = b; i >= t; i--)
                ret[i][l] = s++;
            l++;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new E181832());
    }
}
