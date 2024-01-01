package programmers.java;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class E120890 {
    public int solution(int[] array, int n) {
        return IntStream.of(array).boxed().sorted((a, b) -> {
            if (Math.abs(n - b) < Math.abs(n - a)) {
                return -1;
            } else if (Math.abs(n - b) > Math.abs(n - a)) {
                return 1;
            } else {
                if (a < b) {
                    return -1;
                } else if (a > b) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }).collect(Collectors.toList())
                .get(array.length - 1);
    }

    public static void main(String[] args) {
        System.out.println(new E120890());
    }
}
