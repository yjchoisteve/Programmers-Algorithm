package programmers.java;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class E181894 {
    public int[] solution(int[] arr) {
        StringBuilder sb = new StringBuilder(
                IntStream.of(arr).mapToObj(x -> String.valueOf(x)).collect(Collectors.joining("-")));
        return sb.toString().contains("2")
                ? Arrays.asList(sb.substring(sb.indexOf("2"), sb.lastIndexOf("2") + 1).split("-")).stream()
                        .mapToInt(x -> Integer.parseInt(x)).toArray()
                : new int[] { -1 };
    }

    public static void main(String[] args) {
        System.out.println(new E181894());
    }
}
