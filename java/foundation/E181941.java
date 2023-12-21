package programmers.java;

import java.util.Scanner;

public class E181941 {
    public String solution(String[] arr) {
        return String.join("", arr);
    }

    public static void main(String[] args) {
        System.out.println(new E181941().solution(new String[] { "a", "b", "c" }));
    }
}
