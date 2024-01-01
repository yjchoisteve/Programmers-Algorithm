package programmers.java.foundation;

import java.util.Scanner;

public class E181906 {
    public int solution(String my_string, String is_prefix) {
        return my_string.startsWith(is_prefix) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(new E181906().solution("banana", "ban"));
        System.out.println(new E181906().solution("banana", "nan"));
        System.out.println(new E181906().solution("banana", "abcd"));
        System.out.println(new E181906().solution("banana", "bananan"));
    }
}
