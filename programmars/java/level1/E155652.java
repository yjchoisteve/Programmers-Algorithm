package programmars.java.level1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class E155652 {
    public String solution(String s, String skip, int index) {
        List<String> alphabets = IntStream.range(0, 26)
                .mapToObj(i -> String.valueOf(Character.valueOf((char) ('a' + i)))).filter(e -> !skip.contains(e))
                .collect(Collectors.toList());
        return Stream.of(s.split("")).map(e -> alphabets.get((alphabets.indexOf(e) + index) % alphabets.size()))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(new E155652().solution("aukks", "wbqd", 5));
    }
}
