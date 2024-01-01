package programmers.java;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class E120833 {
    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2);
    }

    public static void main(String[] args) {
        System.out.println(new E120833());
    }
}
