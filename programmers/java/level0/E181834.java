package programmers.java.level0;

import java.util.Scanner;
import java.util.stream.Collector;

public class E181834 {
    public String solution(String myString) {
        return myString.chars().mapToObj(x -> (char) x < 'l' ? 'l' : (char) x)
                .collect(Collector.of(StringBuilder::new, StringBuilder::append, StringBuilder::append,
                        StringBuilder::toString));
    }

    public static void main(String[] args) {
        System.out.println(new E181834().solution("abcdevwxyz"));
        System.out.println(new E181834().solution("jjnnllkkmm"));
    }
}
