package programmers.java.foundation;

import java.util.Scanner;

public class E181842 {
    public int solution(String str1, String str2) {
        return str2.contains(str1) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(new E181842().solution("abc", "aabcc"));
        System.out.println(new E181842().solution("tbt", "tbbttb"));
    }
}
