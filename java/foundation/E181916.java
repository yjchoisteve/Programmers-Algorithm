package programmers.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class E181916 {
    public int solution(int a, int b, int c, int d) {
        Map<Integer, Long> m = Arrays.asList(a, b, c, d).stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        if (m.size() == 1) {
            return 1111 * a;
        } else if (m.size() == 2) {
            int[] k = m.keySet().stream().mapToInt(x -> x).toArray();
            if (m.get(k[0]) > m.get(k[1])) {
                return (10 * k[0] + k[1]) * (10 * k[0] + k[1]);
            } else if (m.get(k[1]) > m.get(k[0])) {
                return (10 * k[1] + k[0]) * (10 * k[1] + k[0]);
            } else {
                return (k[0] + k[1]) * Math.abs(k[0] - k[1]);
            }
        } else if (m.size() == 3) {
            int[] k = m.keySet().stream().filter(i -> m.get(i) != 2l).mapToInt(x -> x).toArray();
            return k[0] * k[1];
        } else {
            return m.keySet().stream().mapToInt(x -> x).min().getAsInt();
        }
    }

    public static void main(String[] args) {
        System.out.println(new E181916().solution(6, 3, 3, 6));
    }
}
