package programmers.java;

import java.util.Scanner;
import java.util.stream.IntStream;

public class E120887 {
    public int solution(int i, int j, int k) {
        return (int) IntStream.rangeClosed(i, j)
                .map(n -> (int) String.valueOf(n).chars().filter(m -> m - 48 == k).count()).sum();
    }

    public static void main(String[] args) {
        System.out.println(new E120887());
    }
}
