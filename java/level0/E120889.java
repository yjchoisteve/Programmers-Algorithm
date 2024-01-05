package programmers.java.level0;

import java.util.Scanner;
import java.util.stream.IntStream;

public class E120889 {
    public int solution(int[] sides) {
        sides = IntStream.of(sides).sorted().toArray();
        return sides[2] < sides[1] + sides[0] ? 1 : 2;
    }

    public static void main(String[] args) {
        System.out.println(new E120889());
    }
}
