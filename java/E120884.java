package programmers.java;

import java.util.Scanner;

public class E120884 {
    public int solution(int chicken) {
        int ret = 0;
        while (chicken >= 10) {
            ret += chicken / 10;
            chicken = chicken % 10 + chicken / 10;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new E120884().solution(100));
        System.out.println(new E120884().solution(1081));
    }
}
