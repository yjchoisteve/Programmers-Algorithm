package programmers.java;

import java.util.Scanner;

public class E120806 {
    public int solution(int num1, int num2) {
        return (int) ((num1 / (double) num2) * 1000);
    }

    public static void main(String[] args) {
        System.out.println(new E120806().solution(3, 2));
    }
}
