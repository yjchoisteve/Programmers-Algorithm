package programmers.java;

import java.util.Scanner;
import java.util.stream.IntStream;

public class E181897 {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        return IntStream.iterate(n == 1 ? 0 : slicer[0], i -> i <= (n == 2 ? num_list.length - 1 : slicer[1]),
                i -> i += n == 4 ? slicer[2] : 1).map(i -> num_list[i]).toArray();
    }

    public static void main(String[] args) {
        System.out.println(new E181897());
    }
}
