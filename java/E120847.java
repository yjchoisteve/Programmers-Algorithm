package programmers.java;

import java.util.stream.IntStream;

public class E120847 {
    public int solution(int[] numbers) {
        int[] l = IntStream.of(numbers).sorted().skip(numbers.length - 2).toArray();
        return l[0] * l[1];
    }

    public static void main(String[] args) {
        System.out.println(new E120847());
    }
}
