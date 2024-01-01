package programmers.java;

import java.util.Scanner;
import java.util.stream.IntStream;

public class E120913 {
    public String[] solution(String my_str, int n) {
        return IntStream.range(0, (int) Math.ceil((double) my_str.length() / n))
                .mapToObj(i -> my_str.substring(i * n, (i + 1) * n < my_str.length() ? (i + 1) * n : my_str.length()))
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        System.out.println(new E120913());
    }
}
