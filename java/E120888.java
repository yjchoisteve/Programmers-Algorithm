package programmers.java;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class E120888 {
    public String solution(String my_string) {
        return new LinkedHashSet<>(Arrays.asList(my_string.split(""))).stream().collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(new E120888().solution("people"));
        System.out.println(new E120888().solution("We are the world"));
    }
}
