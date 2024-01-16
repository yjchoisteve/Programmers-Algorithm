package programmers.java.level0;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class E120902 {
    public int solution(String my_string) {
        return Stream.of(my_string.replaceAll("- ", "-").replaceAll("[+] ", "").split("-")).mapToInt(Integer::parseInt)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(new E120902());
    }
}
