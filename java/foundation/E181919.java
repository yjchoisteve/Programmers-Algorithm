package programmers.java.foundation;

import java.util.stream.IntStream;

public class E181919 {
    public int[] solution(int n) {
        return IntStream.concat(IntStream.iterate(n, i -> i != 1, i -> i = i % 2 == 0 ? i / 2 : 3 * i + 1)
                .takeWhile(i -> i != 1), IntStream.range(1, 2)).toArray();
    }

    public static void main(String[] args) {
        IntStream.of(new E181919().solution(10)).forEach(x -> System.out.print(x + " "));
    }
}
