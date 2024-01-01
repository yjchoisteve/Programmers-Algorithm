package programmers.java.foundation;

import java.util.Scanner;

public class E181863 {
    public String solution(String rny_string) {
        return rny_string.replace("m", "rn");
    }

    public static void main(String[] args) {
        System.out.println(new E181863().solution("masterpiece"));
        System.out.println(new E181863().solution("programmers"));
        System.out.println(new E181863().solution("jerry"));
        System.out.println(new E181863().solution("burn"));
    }
}
