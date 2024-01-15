package programmars.java.level0;

import java.util.Scanner;

public class E181873 {
    public String solution(String my_string, String alp) {
        return my_string.replaceAll(alp, alp.toUpperCase());
    }

    public static void main(String[] args) {
        System.out.println(new E181873().solution("programmers", "p"));
        System.out.println(new E181873().solution("lowercase", "x"));
    }
}
