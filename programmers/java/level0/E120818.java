package programmers.java.level0;

import java.util.Scanner;

public class E120818 {
    public int solution(int price) {
        return (int) (price * (1 - (price >= 500000 ? 0.2 : price >= 300000 ? 0.1 : price >= 100000 ? 0.05 : 0)));
    }

    public static void main(String[] args) {
        System.out.println(new E120818());
    }
}
