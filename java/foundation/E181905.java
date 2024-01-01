package programmers.java.foundation;

import java.util.Scanner;

public class E181905 {
    public String solution(String my_string, int s, int e) {
        return my_string.substring(0, s) + new StringBuilder(my_string.substring(s, e + 1)).reverse().toString()
                + my_string.substring(e + 1);
    }

    public static void main(String[] args) {
        System.out.println(new E181905().solution("Progra21Sremm3", 6, 12));
        System.out.println(new E181905().solution("Stanley1yelnatS", 4, 10));
    }
}
