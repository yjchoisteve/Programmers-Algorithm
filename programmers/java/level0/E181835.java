package programmers.java.level0;

import java.util.stream.IntStream;

public class E181835 {
    public int[] solution(int[] arr, int k) {
        return IntStream.of(arr).map(x -> k % 2 == 0 ? x + k : x * k).toArray();
    }

    public static void main(String[] args) {
        System.out.println(new E181835().solution(new int[] { 1, 2, 3, 100, 99, 98 }, 3));
        System.out.println(new E181835().solution(new int[] { 1, 2, 3, 100, 99, 98 }, 2));
    }
}
