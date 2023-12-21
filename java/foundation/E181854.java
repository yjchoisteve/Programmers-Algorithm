package programmers.java;

import java.util.stream.IntStream;

public class E181854 {
    public int[] solution(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr.length % 2 == 1 && i % 2 == 0)
                arr[i] += n;
            else if (arr.length % 2 == 0 && i % 2 == 1)
                arr[i] += n;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(new E181854().solution(new int[] { 49, 12, 100, 276, 33 }, 27));
        System.out.println(new E181854().solution(new int[] { 444, 555, 666, 777 }, 100));
    }
}
