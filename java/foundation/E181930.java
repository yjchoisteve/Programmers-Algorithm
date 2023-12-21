package programmers.java;

import java.util.Scanner;

public class E181930 {
    public int solution(int a, int b, int c) {
        if (a != b && b != c && a != c) {
            return a + b + c;
        } else if (a == b && b == c) {
            return (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        } else {
            return (a + b + c) * (a * a + b * b + c * c);
        }
    }

    public static void main(String[] args) {
        System.out.println(new E181930().solution(2, 6, 1));
        System.out.println(new E181930().solution(5, 3, 3));
        System.out.println(new E181930().solution(4, 4, 4));
    }
}
