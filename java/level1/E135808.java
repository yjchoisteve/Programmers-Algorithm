package programmers.java.level1;

import java.util.Comparator;
import java.util.stream.IntStream;

public class E135808 {
    public int solution(int k, int m, int[] score) {
        score = IntStream.of(score).sorted().skip(score.length % m).toArray();
        int max = score.length / m * m;
        int sum = 0;
        for (int i = 0; i < max; i += m) {
            sum += score[i] * m;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new E135808());
    }
}
