package programmers.java;

import java.util.Scanner;

public class E181876 {
    public String solution(String myString) {
        return myString.toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println(new E181876().solution("aBcDeFg"));
        System.out.println(new E181876().solution("aaa"));
    }
}
