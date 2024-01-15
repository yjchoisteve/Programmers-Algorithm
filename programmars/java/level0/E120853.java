package programmars.java.level0;

import java.util.Scanner;
import java.util.stream.Stream;

public class E120853 {
    public int solution(String s) {
        return Stream.of(s.replaceAll("-?\\d+\\sZ", "").split(" ")).filter(i -> !i.equals(""))
                .mapToInt(i -> Integer.parseInt(i)).sum();
    }

    public static void main(String[] args) {
        System.out.println(new E120853().solution("1 2 Z 3"));
        System.out.println(new E120853().solution("10 20 30 40"));
        System.out.println(new E120853().solution("10 Z 20 Z 1"));
        System.out.println(new E120853().solution("10 Z 20 Z"));
        System.out.println(new E120853().solution("-1 -2 -3 Z"));
    }
}
