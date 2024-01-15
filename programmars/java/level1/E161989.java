package programmars.java.level1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class E161989 {
    public int solution(int n, int m, int[] section) {
        List<Integer> l = IntStream.of(section).boxed().collect(Collectors.toList());
        int ret = 0;
        while (!l.isEmpty()) {
            l.removeIf(i -> i < l.get(0) + m);
            ret++;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new E161989());
    }
}
