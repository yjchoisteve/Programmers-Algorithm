package programmers.java;

import java.util.stream.Collector;
import java.util.stream.IntStream;

public class E181903 {
    public String solution(int q, int r, String code) {
        return IntStream.range(0, code.length()).filter(i -> i % q == r).mapToObj(i -> String.valueOf(code.charAt(i)))
                .collect(Collector.of(StringBuilder::new, StringBuilder::append, StringBuilder::append,
                        StringBuilder::toString));
    }

    public static void main(String[] args) {
        System.out.println(new E181903());
    }
}
