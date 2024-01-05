package programmers.java.level0;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class E181909 {
    public String[] solution(String my_string) {
        return IntStream.range(0, my_string.length()).mapToObj(my_string::substring).sorted()
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        Arrays.asList(new E181909().solution("banana")).forEach(s -> System.out.println(s + " "));
        System.out.println();
        Arrays.asList(new E181909().solution("programmers")).forEach(s -> System.out.println(s + " "));
    }
}
