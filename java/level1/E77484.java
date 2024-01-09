package programmers.java.level1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class E77484 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] results = { 1, 2, 3, 4, 5, 6, 6 };
        List<Integer> l = IntStream.of(win_nums).boxed().collect(Collectors.toList());
        int zeros = 0;
        for (int i : lottos) {
            l.remove(Integer.valueOf(i));
            if (i == 0) {
                zeros++;
            }
        }
        return new int[] { results[Math.max(l.size() - zeros, 0)], results[l.size()] };
    }

    public static void main(String[] args) {
        System.out.println(new E77484());
    }
}
