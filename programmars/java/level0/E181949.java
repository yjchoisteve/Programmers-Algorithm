package programmars.java.level0;

import java.util.Scanner;

public class E181949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuffer s = new StringBuffer(a);
        for (int i = 0; i < a.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                s.setCharAt(i, Character.toLowerCase(s.charAt(i)));
            } else if (Character.isLowerCase(s.charAt(i))) {
                s.setCharAt(i, Character.toUpperCase(s.charAt(i)));
            }
        }
        System.out.println(s.toString());
    }
}