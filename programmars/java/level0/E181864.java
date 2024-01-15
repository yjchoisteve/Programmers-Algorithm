package programmars.java.level0;

import java.util.Scanner;
import java.util.stream.Collector;

public class E181864 {
    public int solution(String myString, String pat) {
        return myString.chars().mapToObj(x -> ((char) (x)) == 'A' ? 'B' : 'A')
                .collect(Collector.of(StringBuilder::new, StringBuilder::append, StringBuilder::append,
                        StringBuilder::toString))
                .contains(pat) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(new E181864().solution("ABBAA", "AABB"));
        System.out.println(new E181864().solution("ABAB", "ABAB"));
    }
}
