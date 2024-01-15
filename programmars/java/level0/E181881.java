package programmars.java.level0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class E181881 {
    public int solution(int[] arr) {
        int count = 0;
        while (true) {
            int[] l2 = IntStream.of(arr).map(i -> i % 2 == 0 && i >= 50 ? i / 2 : i % 2 == 1 && i < 50 ? i * 2 + 1 : i)
                    .toArray();
            if (Arrays.compare(arr, l2) == 0)
                break;
            arr = l2;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new E181881());
    }
}
