package programmers.java;

import java.util.Arrays;
import java.util.stream.Stream;

public class E181866 {
    public String[] solution(String myString) {
        return Stream.of(myString.split("x")).filter(x -> !x.equals("")).sorted().toArray(String[]::new);
    }

    public static void main(String[] args) {
        for (String solution : new E181866().solution("axbxcxdx")) {
            System.out.println(solution);
        }
        System.out.println();
        Arrays.asList(new E181866().solution("dxccxbbbxaaaa")).forEach(x -> System.out.println(x));
    }
}
