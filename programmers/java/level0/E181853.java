package programmers.java.level0;

import java.util.Scanner;
import java.util.stream.IntStream;

public class E181853 {
    public int[] solution(int[] num_list) {
        return IntStream.of(num_list).sorted().limit(5).toArray();
    }

    public static void main(String[] args) {
        System.out.println(new E181853().solution(new int[] { 12, 4, 15, 46, 38, 1, 14 }));
    }
}
