package programmers.java;

import java.util.Scanner;

public class E181908 {
    public int solution(String my_string, String is_suffix) {
        return my_string.endsWith(is_suffix) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(new E181908().solution("banana", "ana"));
        System.out.println(new E181908().solution("banana", "nan"));
        System.out.println(new E181908().solution("banana", "wxyz"));
        System.out.println(new E181908().solution("banana", "abanana"));
    }
}
