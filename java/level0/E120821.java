package programmers.java.level0;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class E120821 {
    public int[] solution(int[] num_list) {
        List<Integer> l = IntStream.of(num_list).boxed().collect(Collectors.toList());
        Collections.reverse(l);
        return l.stream().mapToInt(x -> x).toArray();
    }

    public static void main(String[] args) {
        System.out.println(new E120821());
    }
}
