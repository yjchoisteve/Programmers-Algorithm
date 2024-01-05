package programmers.java.level0;

import java.util.Scanner;

public class E181914 {
    public int solution(String number) {
        return number.chars().map(x -> x - 48).sum() % 9;
    }

    public static void main(String[] args) {
        System.out.println(new E181914().solution("123"));
        System.out.println(new E181914().solution("78720646226947352489"));
    }
}
