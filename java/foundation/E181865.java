package programmers.java;

import java.util.Scanner;

public class E181865 {
    public int solution(String binomial) {
        String[] t = binomial.split("\\s+");
        int a = Integer.parseInt(t[0]);
        int b = Integer.parseInt(t[2]);
        String op = t[1];
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) {
        System.out.println(new E181865().solution("43 + 12"));
        System.out.println(new E181865().solution("0 - 7777"));
        System.out.println(new E181865().solution("40000 * 40000"));
    }
}
