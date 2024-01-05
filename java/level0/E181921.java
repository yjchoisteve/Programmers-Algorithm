package programmers.java.level0;

import java.util.Scanner;
import java.util.stream.IntStream;

public class E181921 {
    public int[] solution(int l, int r) {
        int[] ret = IntStream.rangeClosed(l, r).filter(x -> Integer.toString(x).matches("[05]+")).toArray();
        return ret.length > 0 ? ret : new int[] { -1 };
    }

    public static void main(String[] args) {
        System.out.println(new E181921());
    }
}
