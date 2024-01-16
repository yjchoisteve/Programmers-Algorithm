package programmers.java.level0;

import java.util.stream.IntStream;

public class E181899 {
    public int[] solution(int start, int end_num) {
        return IntStream.iterate(start, i -> i - 1).limit(start - end_num + 1).toArray();
    }

    public static void main(String[] args) {
        IntStream.of(new E181899().solution(10, 3)).forEach(x -> System.out.println(x));
    }
}
