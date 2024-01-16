package programmers.java.level0;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class E181871 {
    public int solution(String myString, String pat) {
        return IntStream.range(0, myString.length()).map(x -> myString.substring(x).startsWith(pat) ? 1 : 0).sum();
    }

    public static void main(String[] args) {
        System.out.println(new E181871().solution("banana", "ana"));
        System.out.println(new E181871().solution("aaaa", "aa"));
    }
}
