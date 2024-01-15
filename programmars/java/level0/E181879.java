package programmars.java.level0;

import java.util.stream.IntStream;

public class E181879 {
    public int solution(int[] num_list) {
        if (num_list.length > 10) {
            return IntStream.of(num_list).sum();
        } else {
            int ret = 1;
            for (int x : num_list)
                ret *= x;
            return ret;
        }
    }

    public static void main(String[] args) {
        System.out.println(new E181879().solution(new int[] { 3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1 }));
        System.out.println(new E181879().solution(new int[] { 2, 3, 4, 5 }));
    }
}
