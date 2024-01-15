package programmars.java.level0;

import java.util.Scanner;
import java.util.stream.Stream;

public class E120850 {
    public int[] solution(String my_string) {
        return Stream.of(my_string.replaceAll("[a-z]", "").split("")).sorted().mapToInt(s -> Integer.parseInt(s))
                .toArray();
    }

    public static void main(String[] args) {
        System.out.println(new E120850());
    }
}
