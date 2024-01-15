package programmars.java.level0;

import java.util.Scanner;

public class E181940 {
    public String solution(String my_string, int k) {
        return my_string.repeat(k);
    }

    public static void main(String[] args) {
        System.out.println(new E181940().solution("string", 3));
        System.out.println(new E181940().solution("love", 10));
    }
}
