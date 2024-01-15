package programmars.java.level0;

import java.util.Scanner;

public class E120841 {
    public int solution(int[] dot) {
        return dot[0] < 0 ? dot[1] < 0 ? 3 : 2 : dot[1] < 0 ? 4 : 1;
    }

    public static void main(String[] args) {
        System.out.println(new E120841());
    }
}
