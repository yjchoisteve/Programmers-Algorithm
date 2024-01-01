package programmers.java.foundation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class E181861 {
    public int[] solution(int[] arr) {
        List<Integer> l = new ArrayList<>();
        for (int x : arr) {
            l.addAll(IntStream.iterate(x, y -> y).limit(x).boxed().collect(Collectors.toList()));
        }
        return l.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(new E181861().solution(new int[] { 5, 1, 4 }));
        System.out.println(new E181861().solution(new int[] { 6, 6 }));
        System.out.println(new E181861().solution(new int[] { 1 }));
    }
}
