package programmers.java.foundation;

import java.util.Scanner;

public class E181848 {
    public int solution(String n_str) {
        return Integer.valueOf(n_str);
    }

    public static void main(String[] args) {
        System.out.println(new E181848().solution("10"));
        System.out.println(new E181848().solution("8542"));
    }
}
