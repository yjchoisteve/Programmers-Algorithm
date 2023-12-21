package programmers.java;

import java.util.Arrays;

public class E181912 {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        return Arrays.asList(intStrs).stream().mapToInt(x -> Integer.parseInt(x.substring(s, s + l))).filter(x -> x > k)
                .toArray();
    }

    public static void main(String[] args) {
        System.out.println(new E181912());
    }
}
