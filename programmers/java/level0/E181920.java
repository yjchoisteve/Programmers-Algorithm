package programmers.java.level0;

import java.util.Scanner;

public class E181920 {
    public int[] solution(int start_num, int end_num) {
        int[] ret = new int[end_num - start_num + 1];
        for (int i = 0; start_num <= end_num; start_num++, i++)
            ret[i] = start_num;
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new E181920().solution(3, 10));
    }
}
