package programmers.java.foundation;

import java.util.Scanner;
import java.util.stream.IntStream;

public class E181922 {
    public int[] solution(int[] arr, int[][] queries) {
        return IntStream.range(0, arr.length).map(x -> {
            int r = arr[x];
            for (int[] q : queries) {
                if (x % q[2] == 0 && q[0] <= x && q[1] >= x)
                    r++;
            }
            return r;
        }).toArray();
    }

    public static void main(String[] args) {
        System.out.println(new E181922());
    }
}
