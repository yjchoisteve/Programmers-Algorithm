package programmers.java;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class E181851 {
    public int solution(int[] rank, boolean[] attendance) {
        return IntStream.range(0, rank.length).filter(i -> attendance[i]).boxed()
                .sorted(Comparator.comparing(i -> rank[i])).limit(3).reduce((current, next) -> current * 100 + next)
                .get();
    }

    public static void main(String[] args) {
        System.out.println(new E181851().solution(new int[] { 3, 7, 2, 5, 4, 6, 1 },
                new boolean[] { false, true, true, true, true, false, false }));
    }
}
