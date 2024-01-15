package programmars.java.level1;

import java.math.BigDecimal;
import java.util.stream.IntStream;

public class E147355 {
    public int solution(String t, String p) {
        return (int) IntStream.rangeClosed(0, t.length() - p.length())
                .mapToObj(i -> new BigDecimal(t.substring(i, i + p.length())))
                .filter(i -> i.compareTo(new BigDecimal(p)) <= 0)
                .count();
    }

    public static void main(String[] args) {
        System.out.println(new E147355().solution("500220839878", "700220839878"));
    }
}
