package programmers.java;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class E181836 {
    public String[] solution(String[] picture, int k) {
        return IntStream.range(0, picture.length * k).mapToObj(i -> {
            String s = picture[i / k];
            StringBuilder sb = new StringBuilder();
            s.chars().forEach(x -> {
                sb.append(String.valueOf((char) x).repeat(k));
            });
            return sb.toString();
        }).toArray(String[]::new);
    }

    public static void main(String[] args) {
        for (String solution : new E181836().solution(new String[] { ".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.",
                "..x...x..", "...x.x...", "....x...." }, 2)) {
            System.out.println(solution);
        }
    }
}
