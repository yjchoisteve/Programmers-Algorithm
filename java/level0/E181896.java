package programmers.java.level0;

import java.util.Scanner;

public class E181896 {
    public int solution(int[] num_list) {
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new E181896().solution(new int[] { 12, 4, 15, 46, 38, -2, 15 }));
        System.out.println(new E181896().solution(new int[] { 13, 22, 53, 24, 15, 6 }));
    }
}
