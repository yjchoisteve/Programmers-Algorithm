package programmers.java.foundation;

import java.util.stream.Collector;

public class E181874 {
    public String solution(String myString) {
        return myString.chars()
                .mapToObj(i -> (char) (i == 65 ? i
                        : i == 97 ? Character.valueOf('A')
                                : Character.isUpperCase(i) ? Character.toLowerCase(i) : i))
                .collect(Collector.of(StringBuilder::new, StringBuilder::append, StringBuilder::append,
                        StringBuilder::toString));
    }

    public static void main(String[] args) {
        System.out.println(new E181874().solution("abstract algebra"));
        System.out.println(new E181874().solution("PrOgRaMmErS"));
    }
}
