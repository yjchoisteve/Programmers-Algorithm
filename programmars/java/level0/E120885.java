package programmars.java.level0;

import java.util.Scanner;

public class E120885 {
    public String solution(String bin1, String bin2) {
        return Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
    }

    public static void main(String[] args) {
        System.out.println(new E120885());
    }
}
