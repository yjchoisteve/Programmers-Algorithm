package programmers.java.level0;

import java.util.Scanner;
import java.util.stream.IntStream;

public class E181895 {
    public int[] solution(int[] arr, int[][] intervals) {
        return IntStream.concat(IntStream.rangeClosed(intervals[0][0], intervals[0][1]).map(i -> arr[i]),
                IntStream.rangeClosed(intervals[1][0], intervals[1][1]).map(i -> arr[i])).toArray();
    }

    public static void main(String[] args) {
        for (int solution : new E181895().solution(new int[] { 1, 2, 3, 4, 5 }, new int[][] { { 1, 3 }, { 0, 4 } })) {
            System.out.println(solution);
        }
    }
}
