package programmars.java.level1;

import java.util.stream.IntStream;

public class E82612 {
    public long solution(int price, int money, int count) {
        return Math.max(IntStream.rangeClosed(1, count).mapToLong(i -> i * price).sum() - money, 0);
    }

    public static void main(String[] args) {
        System.out.println(new E82612());
    }
}
