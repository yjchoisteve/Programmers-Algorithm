package programmers.java;

import java.util.Scanner;

public class E120904 {
    public int solution(int num, int k) {
        int r = String.valueOf(num).indexOf(String.valueOf(k));
        return r == -1 ? -1 : r + 1;
    }

    public static void main(String[] args) {
        System.out.println(new E120904());
    }
}
