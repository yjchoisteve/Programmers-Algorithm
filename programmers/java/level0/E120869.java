package programmers.java.level0;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class E120869 {
    public int solution(String[] spell, String[] dic) {
        String w = Stream.of(spell).sorted().collect(Collectors.joining());
        return Stream.of(dic).map(s -> Stream.of(s.split("")).sorted().collect(Collectors.joining()))
                .filter(s -> s.equals(w)).count() == 1 ? 1 : 2;
    }

    public static void main(String[] args) {
        System.out.println(new E120869());
    }
}
