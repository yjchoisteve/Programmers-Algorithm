package programmers.java;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class E181900 {
    public String solution(String my_string, int[] indices) {
        return IntStream.range(0, my_string.length())
                .mapToObj(i -> IntStream.of(indices).boxed().collect(Collectors.toList()).contains(i) ? ""
                        : String.valueOf(my_string.charAt(i)))
                .collect(Collectors.joining(""));
    }

    public static void main(String[] args) {
        System.out.println(new E181900().solution("apporoograpemmemprs", new int[] { 1, 16, 6, 15, 0, 10, 11, 3 }));
    }
}
