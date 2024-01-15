package programmars.java.level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class E181893 {
    public int[] solution(int[] arr, int[] query) {
        // List<Integer> l = IntStream.of(arr).boxed().collect(Collectors.toList());
        // for (int i = 0; i < query.length; i++) {
        // l = l.subList(i % 2 == 0 ? 0 : query[i], i % 2 == 1 ? l.size() : query[i] +
        // 1);
        // }
        // return l.stream().mapToInt(x -> x).toArray();
        return IntStream.range(0, query.length).boxed().reduce(arr, (current, next) -> Arrays.copyOfRange(current,
                next % 2 == 0 ? 0 : query[next], next % 2 == 0 ? query[next] + 1 : current.length), (a, b) -> a);
    }

    public static void main(String[] args) {
        for (int solution : new E181893().solution(new int[] { 0, 1, 2, 3, 4, 5 }, new int[] { 4, 1, 2 })) {
            System.out.println(solution);
        }
    }
}
