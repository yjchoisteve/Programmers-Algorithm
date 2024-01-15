package programmars.java.level0;

import java.util.Scanner;

public class E120845 {
    public int solution(int[] box, int n) {
        return box[0] / n * (box[1] / n) * (box[2] / n);
    }

    public static void main(String[] args) {
        System.out.println(new E120845());
    }
}
