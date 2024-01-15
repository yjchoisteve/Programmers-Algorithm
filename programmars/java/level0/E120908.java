package programmars.java.level0;

import java.util.Scanner;

public class E120908 {
    public int solution(String str1, String str2) {
        return str1.contains(str2) ? 1 : 2;
    }

    public static void main(String[] args) {
        System.out.println(new E120908());
    }
}
