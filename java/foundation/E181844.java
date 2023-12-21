package programmers.java;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class E181844 {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> l = IntStream.of(delete_list).boxed().collect(Collectors.toList());
        return IntStream.of(arr).filter(x -> !l.contains(x)).toArray();
    }

    public static void main(String[] args) {
        System.out.println(
                new E181844().solution(new int[] { 293, 1000, 395, 678, 94 }, new int[] { 94, 777, 104, 1000, 1, 12 }));
        System.out.println(new E181844().solution(new int[] { 110, 66, 439, 785, 1 }, new int[] { 377, 823, 119, 43 }));
    }
}
