package programmars.java.level0;

import java.util.Scanner;

public class E181907 {
    public String solution(String my_string, int n) {
        return my_string.substring(0, n);
    }

    public static void main(String[] args) {
        System.out.println(new E181907().solution("ProgrammerS123", 11));
        System.out.println(new E181907().solution("He110W0r1d", 5));
    }
}
