package programmers.java.level0;

import java.util.Scanner;

public class E181878 {
    public int solution(String myString, String pat) {
        return myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(new E181878().solution("AbCdEfG", "aBc"));
        System.out.println(new E181878().solution("aaAA", "aaaaa"));
    }
}
