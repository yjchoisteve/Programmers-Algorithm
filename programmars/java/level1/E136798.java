package programmars.java.level1;

import java.util.stream.IntStream;

public class E136798 {
    public int solution(int number, int limit, int power) {
        return IntStream.rangeClosed(1, number).map(i -> {
            int count = i != 1 ? 2 : 1;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    if (count > limit) {
                        return power;
                    }
                }
            }
            return count;
        }).sum();
    }

    public static void main(String[] args) {
        System.out.println(new E136798());
    }
}
