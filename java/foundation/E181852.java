package programmers.java;

import java.util.stream.IntStream;

public class E181852 {
    public int[] solution(int[] num_list) {
        return IntStream.of(num_list).sorted().skip(5).toArray();
    }

    public static void main(String[] args) {
        IntStream.of(new E181852().solution(new int[] { 12, 4, 15, 46, 38, 1, 14, 56, 32, 10 }))
                .forEach(x -> System.out.println(x));
    }
}
