package programmers.java;

import java.util.Scanner;

public class E181877 {
    public String solution(String myString) {
        return myString.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(new E181877().solution("aBcDeFg"));
        System.out.println(new E181877().solution("AAA"));
    }
}
