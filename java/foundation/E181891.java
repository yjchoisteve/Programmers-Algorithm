package programmers.java;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class E181891 {
    public int[] solution(int[] num_list, int n) {
        List<Integer> l1 = IntStream.of(num_list).skip(n).boxed().collect(Collectors.toList());
        List<Integer> l2 = IntStream.of(num_list).limit(n).boxed().collect(Collectors.toList());
        l1.addAll(l2);
        return l1.stream().mapToInt(x -> x).toArray();
    }

    public static void main(String[] args) {
        IntStream.of(new E181891().solution(new int[] { 2, 1, 6 }, 1)).forEach(x -> System.out.println(x));
        IntStream.of(new E181891().solution(new int[] { 5, 2, 1, 7, 5 },
                3)).forEach(x -> System.out.println(x));
    }
}
