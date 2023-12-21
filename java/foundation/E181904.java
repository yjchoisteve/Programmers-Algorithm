package programmers.java;

import java.util.stream.IntStream;

public class E181904 {
    public String solution(String my_string, int m, int c) {
        return String.join("", IntStream.range(0, (int) Math.ceil(my_string.length() / (double) m))
                .mapToObj(x -> my_string.substring(x * m + c - 1, x * m + c)).toArray(String[]::new));
    }

    public static void main(String[] args) {
        System.out.println(new E181904().solution("ihrhbakrfpndopljhygc", 4, 2));
        System.out.println(new E181904().solution("programmers", 1, 1));
    }
}
