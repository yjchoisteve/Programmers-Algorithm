package programmars.java.level0;

import java.util.Arrays;

public class E181857 {
    public int[] solution(int[] arr) {
        return Arrays.copyOf(arr,
                Integer.highestOneBit(arr.length) < arr.length ? Integer.highestOneBit(arr.length - 1) << 1
                        : Integer.highestOneBit(arr.length));
    }

    public static void main(String[] args) {
        System.out.println(Integer.highestOneBit(6));
        System.out.println(new E181857().solution(new int[] { 1, 2, 3, 4, 5, 6 }));
        System.out.println(new E181857().solution(new int[] { 58, 172, 746, 89 }));
    }
}
