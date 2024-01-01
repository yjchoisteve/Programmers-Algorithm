package programmers.java.foundation;

import java.util.Scanner;

public class E181869 {
    public String[] solution(String my_string) {
        return my_string.split(" ");
    }

    public static void main(String[] args) {
        System.out.println(new E181869().solution("i love you"));
        System.out.println(new E181869().solution("programmers"));
    }
}
