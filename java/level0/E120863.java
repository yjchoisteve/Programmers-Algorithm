package programmers.java.level0;

import java.util.stream.Stream;

public class E120863 {
    public String solution(String polynomial) {
        StringBuilder sb = new StringBuilder();
        String[] l = polynomial.split("\\s\\+\\s");
        int a = Stream.of(l).filter(s -> s.contains("x"))
                .mapToInt(s -> s.equals("x") ? 1 : Integer.parseInt(s.replace("x", "")))
                .sum();
        int b = Stream.of(l).filter(s -> !s.contains("x")).mapToInt(s -> Integer.parseInt(s)).sum();
        sb.append(a == 0 ? "" : a == 1 ? "x" : (a + "x"));
        sb.append(b > 0 ? sb.length() > 0 ? " + " + b : b : "");
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new E120863().solution("3x + 7 + x"));
    }
}
