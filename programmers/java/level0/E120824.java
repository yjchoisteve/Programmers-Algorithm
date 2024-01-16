package programmers.java.level0;

import java.util.Scanner;
import java.util.stream.IntStream;

public class E120824 {
    public int[] solution(int[] num_list) {
        return new int[] { (int) IntStream.of(num_list).filter(i -> i % 2 == 0).count(),
                (int) IntStream.of(num_list).filter(i -> i % 2 == 1).count() };
    }

    public static void main(String[] args) {
        System.out.println(new E120824());
    }
}
