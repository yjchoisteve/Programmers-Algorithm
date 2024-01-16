package programmers.java.level0;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class E120839 {
    public String solution(String rsp) {
        return Stream.of(rsp.split("")).map(s -> s.equals("2") ? "0" : s.equals("0") ? "5" : "2")
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(new E120839());
    }
}
