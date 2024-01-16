package programmers.java.level0;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class E120896 {
    public String solution(String s) {
        Map<String, Long> map = Stream.of(s.split("")).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        return map.keySet().stream().filter(k -> map.get(k) == 1).sorted().collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(new E120896());
    }
}
