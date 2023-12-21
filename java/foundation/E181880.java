package programmers.java;

import java.util.stream.IntStream;

public class E181880 {
    public int solution(int[] num_list) {
        return IntStream.of(num_list).map(n -> Integer.toBinaryString(n).length() - 1).sum();
    }

    public static void main(String[] args) {
        System.out.println(new E181880().solution(new int[] { 12, 4, 15, 1, 14 }));
    }
}
