package programmers.java;

import java.util.stream.IntStream;

public class E120868 {
    public int solution(int[] sides) {
        int m = Math.max(sides[0], sides[1]);
        int n = Math.min(sides[0], sides[1]);
        return (int) IntStream.range(1, sides[1] + sides[0])
                .filter(i -> m < i ? i < (m + n) : m < i + n).count();
    }

    public static void main(String[] args) {
        System.out.println(new E120868());
    }
}
