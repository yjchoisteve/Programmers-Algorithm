package programmers.java;

import java.util.Scanner;

public class E181938 {
    public int solution(int a, int b) {
        int x = Integer.parseInt(a + "" + b);
        int y = 2 * a * b;
        return x >= y ? x : y;
    }

    public static void main(String[] args) {
        System.out.println(new E181938().solution(2, 91));
        System.out.println(new E181938().solution(91, 2));
    }
}
