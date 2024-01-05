package programmers.java.level0;

import java.util.Scanner;

public class E120849 {
    public String solution(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }

    public static void main(String[] args) {
        System.out.println(new E120849());
    }
}
