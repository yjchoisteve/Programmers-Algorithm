package programmars.java.level0;

import java.util.Scanner;

public class E120924 {
    public int solution(int[] common) {
        if (common[2] - common[1] == common[1] - common[0]) {
            return common[common.length - 1] + common[2] - common[1];
        } else {
            return common[common.length - 1] * common[2] / common[1];
        }
    }

    public static void main(String[] args) {
        System.out.println(new E120924());
    }
}
