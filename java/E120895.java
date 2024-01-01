package programmers.java;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class E120895 {
    public String solution(String my_string, int num1, int num2) {
        String[] s = my_string.split("");
        String tmp = s[num1];
        s[num1] = s[num2];
        s[num2] = tmp;
        return Stream.of(s).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(new E120895());
    }
}
