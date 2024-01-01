package programmers.java;

import java.util.stream.Stream;

public class E120906 {
    public int solution(int n) {
        return Stream.of(String.valueOf(n).split("")).mapToInt(i -> Integer.parseInt(i)).sum();
    }

    public static void main(String[] args) {
        System.out.println(new E120906());
    }
}
