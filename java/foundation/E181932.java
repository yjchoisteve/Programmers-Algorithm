package programmers.java;

import java.util.Scanner;
import java.util.stream.IntStream;

public class E181932 {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        int r = 0;
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                r = r == 0 ? 1 : 0;
            } else {
                sb.append(i % 2 == r ? String.valueOf(code.charAt(i)) : "");
            }
        }
        String s = sb.toString();
        return s.isEmpty() ? "EMPTY" : s;
    }

    public static void main(String[] args) {
        System.out.println(new E181932());
    }
}
