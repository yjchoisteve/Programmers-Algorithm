package programmers.java.level0;

import java.util.Scanner;

public class E120819 {
    public int[] solution(int money) {
        return new int[] { money / 5500, money % 5500 };
    }

    public static void main(String[] args) {
        System.out.println(new E120819());
    }
}
