package programmers.java.level1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

public class E138477 {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        return IntStream.range(0, score.length).map(i -> {
            q.add(score[i]);
            if (q.size() > k) {
                q.poll();
            }
            return q.peek();
        }).toArray();
        // return IntStream.range(0, score.length).map(i ->
        // IntStream.of(Arrays.copyOfRange(score, 0, i + 1)).boxed()
        // .sorted(Comparator.reverseOrder()).limit(k).mapToInt(j ->
        // j).min().getAsInt()).toArray();
    }

    public static void main(String[] args) {
        System.out.println(new E138477());
    }
}
