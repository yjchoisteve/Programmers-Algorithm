package programmers.java.level0;

import java.util.Scanner;

public class E120829 {
    public int solution(int angle) {
        return angle < 90 ? 1 : angle == 90 ? 2 : angle < 180 ? 3 : 4;
    }

    public static void main(String[] args) {
        System.out.println(new E120829());
    }
}
