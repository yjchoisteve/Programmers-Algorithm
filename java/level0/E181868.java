package programmers.java.level0;

import java.util.Arrays;
import java.util.stream.Stream;

public class E181868 {
    public String[] solution(String my_string) {
        return Stream.of(my_string.split(" ")).filter(s -> !s.equals("")).toArray(String[]::new);
    }

    public static void main(String[] args) {
        Arrays.asList(new E181868().solution(" i    love  you")).forEach(x -> System.out.println(x));
    }
}
