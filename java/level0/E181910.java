package programmers.java.level0;

import java.util.Scanner;

public class E181910 {
    public String solution(String my_string, int n) {
        return my_string.substring(my_string.length() - n);
    }

    public static void main(String[] args) {
        System.out.println(new E181910().solution("ProgrammerS123", 11));
        System.out.println(new E181910().solution("He110W0r1d", 5));
    }
}
