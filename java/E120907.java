package programmers.java;

import java.util.Scanner;
import java.util.stream.Stream;

public class E120907 {
    public String[] solution(String[] quiz) {
        return Stream.of(quiz).map(s -> {
            String[] f = s.split("\\s\\=\\s");
            int ans = Integer.parseInt(f[1]);
            String[] f2 = f[0].split("\\s[+-]\\s");
            int n1 = Integer.parseInt(f2[0]);
            int n2 = Integer.parseInt(f2[1]);
            if (f[0].contains("+")) {
                return n1 + n2 == ans ? "O" : "X";
            } else {
                return n1 - n2 == ans ? "O" : "X";
            }
        }).toArray(String[]::new);
    }

    public static void main(String[] args) {
        System.out.println(new E120907());
    }
}
