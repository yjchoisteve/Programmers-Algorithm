package programmers.java.foundation;

import java.util.Scanner;

public class E181934 {
    public int solution(String ineq, String eq, int n, int m) {
        return eq.equals("=") && n == m || ineq.equals("<") && n < m || ineq.equals(">") && n > m ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(new E181934().solution("<", "=", 20, 50));
        System.out.println(new E181934().solution(">", "!", 41, 78));
    }
}
