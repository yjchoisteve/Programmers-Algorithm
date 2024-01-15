package programmars.java.level0;

import java.util.Scanner;

public class E181847 {
    public String solution(String n_str) {
        while (n_str.startsWith("0")) {
            n_str = n_str.substring(1);
        }
        return n_str;
    }

    public static void main(String[] args) {
        System.out.println(new E181847().solution("0010"));
        System.out.println(new E181847().solution("854020"));
    }
}
