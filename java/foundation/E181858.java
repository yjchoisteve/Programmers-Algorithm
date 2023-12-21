package programmers.java;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class E181858 {
    public int[] solution(int[] arr, int k) {
        int[] s = Arrays.stream(arr).distinct().toArray();
        // int[] s
        // =IntStream.of(arr).boxed().collect(Collectors.toCollection(LinkedHashSet::new)).stream().mapToInt(x->x).toArray();
        return IntStream.range(0, k).map(i -> i < s.length ? s[i] : -1).toArray();
    }

    public static void main(String[] args) {
        System.out.println(new E181858());
    }
}
