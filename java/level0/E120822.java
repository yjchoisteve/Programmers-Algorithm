package programmers.java.level0;

import java.util.Scanner;

public class E120822 {
    public String solution(String my_string) {
        return new StringBuilder(my_string).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new E120822());
    }
}
