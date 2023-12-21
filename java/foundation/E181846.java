package programmers.java;

import java.math.BigInteger;
import java.util.Scanner;

public class E181846 {
    public String solution(String a, String b) {
        BigInteger A = new BigInteger(a), B = new BigInteger(b);
        return A.add(B) + "";
    }

    public static void main(String[] args) {
        System.out.println(new E181846().solution("582", "734"));
        System.out.println(new E181846().solution("18446744073709551615", "287346502836570928366"));
        System.out.println("305793246910280479981");
        System.out.println(new E181846().solution("0", "0"));
    }
}
