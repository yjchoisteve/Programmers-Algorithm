package programmers.java.level1;

import java.util.stream.IntStream;

public class E12944 {
    public double solution(int[] arr) {
        return IntStream.of(arr).average().getAsDouble();
    }

    public static void main(String[] args) {
        System.out.println(new E12944().solution(new int[] { 1, 2, 3, 4 }));
        System.out.println(new E12944().solution(new int[] { 5, 5 }));
    }
}
