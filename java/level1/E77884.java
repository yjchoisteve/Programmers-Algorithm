package programmers.java.level1;

import java.util.stream.IntStream;

public class E77884 {
    public int solution(int left, int right) {
        return IntStream.rangeClosed(left, right).map(i -> {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }
            return count;
        }).filter(i -> i % 2 == 0).sum();
    }

    public static void main(String[] args) {
        System.out.println(new E77884());
    }
}
