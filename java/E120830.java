package programmers.java;

import java.util.Scanner;

public class E120830 {
    public int solution(int n, int k) {
        return n * 12000 + (k - n / 10) * 2000;
    }

    public static void main(String[] args) {
        System.out.println(new E120830());
    }
}
