package programmars.java.level0;

import java.util.Scanner;

public class E181937 {
    public int solution(int num, int n) {
        return num % n == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(new E181937().solution(98, 2));
        System.out.println(new E181937().solution(34, 3));
    }
}
