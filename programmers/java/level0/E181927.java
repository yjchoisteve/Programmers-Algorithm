package programmers.java.level0;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
import java.util.List;

public class E181927 {
    public int[] solution(int[] num_list) {
        int x = num_list[num_list.length - 1];
        int y = num_list[num_list.length - 2];
        List<Integer> l = IntStream.of(num_list).boxed().collect(Collectors.toList());
        l.add(x > y ? x - y : x * 2);
        return l.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(new E181927().solution(new int[] { 2, 1, 6 }));
        System.out.println(new E181927().solution(new int[] { 5, 2, 1, 7, 5 }));
    }
}
