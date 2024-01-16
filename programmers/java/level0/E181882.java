package programmers.java.level0;

import java.util.Scanner;

public class E181882 {
    public int[] solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0)
                arr[i] /= 2;
            else if (arr[i] < 50 && arr[i] % 2 == 1)
                arr[i] *= 2;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(new E181882().solution(new int[] { 1, 2, 3, 100, 99, 98 }));
    }
}
