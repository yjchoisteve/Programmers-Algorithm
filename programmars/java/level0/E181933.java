package programmars.java.level0;

import java.util.Scanner;

public class E181933 {
    public int solution(int a, int b, boolean flag) {
        return a + (flag ? b : -b);
    }

    public static void main(String[] args) {
        System.out.println(new E181933().solution(-4, 7, true));
        System.out.println(new E181933().solution(-4, 7, false));
    }
}
