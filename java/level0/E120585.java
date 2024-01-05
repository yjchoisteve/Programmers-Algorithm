package programmers.java.level0;

import java.util.Scanner;
import java.util.stream.IntStream;

public class E120585 {
    public int solution(int[] array, int height) {
        return (int) IntStream.of(array).filter(n -> height < n).count();
    }

    public static void main(String[] args) {
        System.out.println(new E120585());
    }
}
