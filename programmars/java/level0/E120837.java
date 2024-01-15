package programmars.java.level0;

import java.util.Scanner;

public class E120837 {
    public int solution(int hp) {
        return hp / 5 + (hp % 5) / 3 + (hp % 5 % 3);
    }

    public static void main(String[] args) {
        System.out.println(new E120837());
    }
}
