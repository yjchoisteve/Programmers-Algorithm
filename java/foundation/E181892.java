package programmers.java.foundation;

import java.util.stream.IntStream;

public class E181892 {
    public int[] solution(int[] num_list, int n) {
        return IntStream.of(num_list).skip(n - 1).toArray();
    }

    public static void main(String[] args) {
        System.out.println(new E181892().solution(new int[] { 2, 1, 6 }, 3));
        System.out.println(new E181892().solution(new int[] { 5, 2, 1, 7, 5 }, 2));
    }
}
