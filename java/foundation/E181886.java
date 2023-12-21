package programmers.java;

import java.util.Arrays;
import java.util.stream.IntStream;

public class E181886 {
    public String[] solution(String[] names) {
        return IntStream.range(0, (int) Math.ceil(names.length / 5.0)).mapToObj(i -> names[i * 5])
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        Arrays.asList(
                new E181886().solution(new String[] { "nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx" }))
                .forEach(x -> System.out.println(x));
    }
}
