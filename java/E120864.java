package programmers.java;

import java.util.stream.Stream;

public class E120864 {
    public int solution(String my_string) {
        return Stream.of(my_string.replaceAll("[a-zA-Z]", " ").trim().split(" ")).filter(s -> !s.equals(""))
                .mapToInt(i -> Integer.parseInt(i)).sum();
    }

    public static void main(String[] args) {
        System.out.println(new E120864().solution("aAb1B2cC34oOp"));
        System.out.println(new E120864().solution("1a2b3c4d123Z"));
    }
}
