package programmers.java.level0;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class E120911 {
    public String solution(String my_string) {
        return Stream.of(my_string.toLowerCase().split("")).sorted().collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(new E120911());
    }
}
