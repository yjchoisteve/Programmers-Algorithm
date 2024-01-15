package programmars.java.level0;

import java.util.stream.IntStream;

public class E120813 {
    public int[] solution(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> i % 2 == 1).toArray();
    }

    public static void main(String[] args) {
        System.out.println(new E120813());
    }
}
