package programmers.java.level0;

import java.util.Scanner;

public class E181939 {
    public int solution(int a, int b) {
        int x = Integer.parseInt(a + "" + b);
        int y = Integer.parseInt(b + "" + a);
        return x >= y ? x : y;
    }

    public static void main(String[] args) {
        System.out.println(new E181939().solution(9, 91));
        System.out.println(new E181939().solution(89, 8));
    }
}
