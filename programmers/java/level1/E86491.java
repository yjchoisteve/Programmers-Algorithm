package programmers.java.level1;

import java.util.Arrays;
import java.util.Scanner;

public class E86491 {
    public int solution(int[][] sizes) {
        int w = 0, h = 0;

        for (int[] size : sizes) {
            Arrays.sort(size);
            w = Math.max(w, size[0]);
            h = Math.max(h, size[1]);
        }
        return w * h;
    }

    public static void main(String[] args) {
        System.out.println(new E86491());
    }
}
