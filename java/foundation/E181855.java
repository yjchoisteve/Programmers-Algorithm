package programmers.java.foundation;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E181855 {
    public int solution(String[] strArr) {
        return Arrays.asList(strArr).stream().map(s -> s.length())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting())).values().stream()
                .mapToInt(Long::intValue).max().orElse(0);
    }

    public static void main(String[] args) {
        System.out.println(new E181855());
    }
}
