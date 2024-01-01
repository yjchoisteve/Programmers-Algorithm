package programmers.java.foundation;

import java.util.stream.IntStream;

public class E181901 {
    public int[] solution(int n, int k) {
        return IntStream.rangeClosed(1, n).filter(x -> x % k == 0).toArray();
    }

    public static void main(String[] args) {
        System.out.println(new E181901().solution(10, 3));
        System.out.println(new E181901().solution(15, 5));
    }
}
