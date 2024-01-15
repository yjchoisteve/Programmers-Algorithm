package programmars.java.level0;

import java.util.stream.IntStream;

public class E120880 {
    public int[] solution(int[] numlist, int n) {
        return IntStream.of(numlist).boxed().sorted((a, b) -> {
            if (a == n) {
                return -(numlist.length);
            } else if (Math.abs(a - n) > Math.abs(b - n)) {
                return 1;
            } else if (Math.abs(a - n) < Math.abs(b - n)) {
                return -1;
            } else {
                return a > b ? -1 : 1;
            }
        }).mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        for (int solution : new E120880().solution(new int[] { 1, 2, 3, 4, 5, 6 }, 4)) {
            System.out.println(solution);
        }
        System.out.println();
        for (int solution : new E120880().solution(new int[] { 10000, 20, 36, 47, 40, 6, 10, 7000 }, 30)) {
            System.out.println(solution);
        }
    }
}
