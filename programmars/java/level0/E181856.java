package programmars.java.level0;

import java.util.stream.IntStream;

public class E181856 {
    public int solution(int[] arr1, int[] arr2) {
        int ret = Integer.compare(arr1.length, arr2.length);
        if (ret == 0) {
            ret = Integer.compare(IntStream.of(arr1).sum(), IntStream.of(arr2).sum());
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new E181856().solution(new int[] { 49, 13 }, new int[] { 70, 11, 2 }));
        System.out.println(new E181856().solution(new int[] { 100, 17, 84, 1 }, new int[] { 55, 12, 65, 36 }));
        System.out.println(new E181856().solution(new int[] { 1, 2, 3, 4, 5 }, new int[] { 3, 3, 3, 3, 3 }));
    }
}
