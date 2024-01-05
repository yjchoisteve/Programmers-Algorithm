package programmers.java.level0;

import java.util.stream.IntStream;

public class E120871 {
    public int solution(int n) {
        return IntStream.rangeClosed(1, n).reduce(0, (c, f) -> {
            do {
                c++;
            } while (String.valueOf(c).contains("3") || c % 3 == 0);
            return c;
        });
    }

    public static void main(String[] args) {
        System.out.println(new E120871().solution(15));
        System.out.println(new E120871().solution(40));
    }
}
