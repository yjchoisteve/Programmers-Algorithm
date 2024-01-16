package programmers.java.level0;

import java.util.Scanner;

public class E120826 {
    public String solution(String my_string, String letter) {
        return my_string.replace(letter, "");
    }

    public static void main(String[] args) {
        System.out.println(new E120826());
    }
}
