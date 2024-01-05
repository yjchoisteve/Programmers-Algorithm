package programmers.java.level0;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class E120882 {
    public int[] solution(int[][] score) {
        List<Double> scores = IntStream.range(0, score.length).mapToDouble(i -> (score[i][0] + score[i][1]) / 2.0)
                .boxed()
                .collect(Collectors.toList());
        List<Double> ordered = scores.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        return scores.stream().mapToInt(i -> ordered.indexOf(i) + 1).toArray();
    }

    public static void main(String[] args) {
        System.out.println(new E120882());
    }
}
