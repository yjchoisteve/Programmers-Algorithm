package programmars.java.level0;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class E120860 {
    public int solution(int[][] dots) {
        List<Integer> x = IntStream.range(0, 4).map(i -> dots[i][0]).boxed().collect(Collectors.toList());
        List<Integer> y = IntStream.range(0, 4).map(i -> dots[i][1]).boxed().collect(Collectors.toList());
        return (x.stream().mapToInt(i -> i).max().getAsInt() - x.stream().mapToInt(i -> i).min().getAsInt())
                * (y.stream().mapToInt(i -> i).max().getAsInt() - y.stream().mapToInt(i -> i).min().getAsInt());
    }

    public static void main(String[] args) {
        System.out.println(new E120860());
    }
}
