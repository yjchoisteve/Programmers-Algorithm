package programmars.java.level0;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class E120815 {
    public int solution(int n) {
        List<Integer> l = IntStream.of(2, 3).boxed().collect(Collectors.toList());
        if (n % 2 == 0) {
            n /= 2;
        }
        if (n % 3 == 0) {
            n /= 3;
        }
        l.add(n);
        return l.stream().mapToInt(i -> i).reduce(1, (c, t) -> c * t) / 6;
    }

    public static void main(String[] args) {
        System.out.println(new E120815().solution(6));
        System.out.println(new E120815().solution(10));
        System.out.println(new E120815().solution(4));
    }
}
