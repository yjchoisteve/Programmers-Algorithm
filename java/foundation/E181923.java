package programmers.java;

import java.util.Arrays;
import java.util.stream.IntStream;

public class E181923 {
    public int[] solution(int[] arr, int[][] queries) {
        return Arrays.stream(queries)
                .map(q -> IntStream.rangeClosed(q[0], q[1]).map(x -> arr[x]).filter(x -> x > q[2]).min().orElse(-1))
                .mapToInt(x -> x).toArray();
    }

    public static void main(String[] args) {
        for (int solution : new E181923().solution(new int[] { 0, 1, 2, 4, 3 },
                new int[][] { { 0, 4, 2 }, { 0, 3, 2 }, { 0, 2, 2 } })) {
            System.out.println(solution);
        }
    }
}
