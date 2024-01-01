package programmers.java;

import java.util.Scanner;
import java.util.stream.Collectors;

public class E120893 {
    public String solution(String my_string) {
        return my_string.chars().mapToObj(
                c -> String.valueOf(
                        Character.isUpperCase(c) ? Character.toLowerCase((char) c) : Character.toUpperCase((char) c)))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(new E120893());
    }
}
