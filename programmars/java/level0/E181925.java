package programmars.java.level0;

import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.IntStream;

public class E181925 {
    public String solution(int[] numLog) {
        return IntStream.range(0, numLog.length - 1).mapToObj(x -> {
            if (numLog[x] + 1 == numLog[x + 1]) {
                return "w";
            } else if (numLog[x] - 1 == numLog[x + 1]) {
                return "s";
            } else if (numLog[x] + 10 == numLog[x + 1]) {
                return "d";
            } else {
                return "a";
            }
        }).collect(Collector.of(StringBuilder::new, StringBuilder::append, StringBuilder::append,
                StringBuilder::toString));
    }

    public static void main(String[] args) {
        System.out.println(new E181925().solution(new int[] { 0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1 }));
    }
}
