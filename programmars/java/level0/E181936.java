package programmars.java.level0;

import java.util.Scanner;

public class E181936 {
    public int solution(int number, int n, int m) {
        return number % n == 0 && number % m == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(new E181936().solution(60, 2, 3));
        System.out.println(new E181936().solution(55, 10, 5));
    }
}
