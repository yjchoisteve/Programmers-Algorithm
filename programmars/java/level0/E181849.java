package programmars.java.level0;

import java.util.stream.IntStream;

public class E181849 {
    public int solution(String num_str) {
        return IntStream.of(num_str.chars().toArray()).map(x -> x - 48).sum();
    }

    public static void main(String[] args) {
        System.out.println(new E181849().solution("123456789"));
        System.out.println(new E181849().solution("1000000"));
    }
}
