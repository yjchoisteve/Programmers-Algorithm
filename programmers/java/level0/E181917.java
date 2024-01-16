package programmers.java.level0;

import java.util.Scanner;

public class E181917 {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 || x2) && (x3 || x4);
    }

    public static void main(String[] args) {
        System.out.println(new E181917());
    }
}
