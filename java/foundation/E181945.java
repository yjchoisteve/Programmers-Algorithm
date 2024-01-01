package programmers.java.foundation;

import java.util.Scanner;

public class E181945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        a.chars().forEach(value -> System.out.println((char) value));
    }
}