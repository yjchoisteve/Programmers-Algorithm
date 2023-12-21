package programmers.java;

import java.util.Scanner;

public class E181839 {
    public int solution(int a, int b) {
        return a % 2 == 1 && b % 2 == 1 ? a * a + b * b : a % 2 == 0 && b % 2 == 0 ? Math.abs(a - b) : 2 * (a + b);
    }

    public static void main(String[] args) {
        System.out.println(new E181839().solution(3, 5));
        System.out.println(new E181839().solution(6, 1));
        System.out.println(new E181839().solution(2, 4));
    }
}
