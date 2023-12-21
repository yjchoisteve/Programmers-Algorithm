package programmers.java;

import java.util.Scanner;
import java.util.stream.IntStream;

public class E181924 {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] q : queries) {
            int tmp = arr[q[0]];
            arr[q[0]] = arr[q[1]];
            arr[q[1]] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        for (int solution : new E181924().solution(new int[] { 0, 1, 2, 3, 4 },
                new int[][] { { 0, 3 }, { 1, 2 }, { 1, 4 } })) {
            System.out.println(solution);
        }
    }
}
