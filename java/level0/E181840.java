package programmers.java.level0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class E181840 {
    public int solution(int[] num_list, int n) {
        return Arrays.stream(num_list).boxed().collect(Collectors.toList()).contains(Integer.valueOf(n)) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(new E181840().solution(new int[] { 1, 2, 3, 4, 5 }, 3));
        System.out.println(new E181840().solution(new int[] { 15, 98, 23, 2, 15 }, 20));
    }
}
