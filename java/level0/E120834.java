package programmers.java.level0;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class E120834 {
    public String solution(int age) {
        return String.valueOf(age).chars().mapToObj(s -> String.valueOf(Character.valueOf((char) (s + 49))))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(new E120834());
    }
}
