package programmers.java.level0;

import java.util.Scanner;

public class E181872 {
    public String solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder(myString);
        return sb.substring(0, sb.lastIndexOf(pat)) + pat;
    }

    public static void main(String[] args) {
        System.out.println(new E181872().solution("AbCdEFG", "dE"));
        System.out.println(new E181872().solution("AAAAaaaa", "a"));
    }
}
