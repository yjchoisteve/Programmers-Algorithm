package programmars.java.level0;

import java.util.Scanner;

public class E181913 {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        for (int[] q : queries) {
            sb = sb.replace(q[0], q[1] + 1, new StringBuilder(sb.substring(q[0], q[1] + 1)).reverse().toString());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new E181913());
    }
}
