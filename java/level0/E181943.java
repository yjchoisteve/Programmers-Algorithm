package programmers.java.level0;

import java.util.Scanner;

public class E181943 {
    public String solution(String my_string, String overwrite_string, int s) {
        return my_string.substring(0, s) + overwrite_string + (overwrite_string.length() + s == my_string.length() ? ""
                : my_string.substring(overwrite_string.length() + s));
    }

    public static void main(String[] args) {
        System.out.println(new E181943().solution("He11oWor1d", "lloWorl", 2));
        System.out.println(new E181943().solution("Program29b8UYP", "merS123", 7));
    }
}