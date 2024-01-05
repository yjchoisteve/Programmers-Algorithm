package programmers.java.level0;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class E120892 {
    public String solution(String cipher, int code) {
        return IntStream.iterate(code - 1, i -> i < cipher.length(), i -> i + code)
                .mapToObj(i -> String.valueOf(cipher.charAt(i))).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(new E120892());
    }
}
