package programmers.java.foundation;

import java.util.Scanner;
import java.util.stream.IntStream;

public class E181887 {
    public int solution(int[] num_list) {
        int x = 0, y = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0)
                x += num_list[i];
            else
                y += num_list[i];
        }
        return x > y ? x : y;
    }

    public static void main(String[] args) {
        System.out.println(new E181887().solution(new int[] { 4, 2, 6, 1, 7, 6 }));
        System.out.println(new E181887().solution(new int[] { -1, 2, 5, 6, 3 }));
    }
}
