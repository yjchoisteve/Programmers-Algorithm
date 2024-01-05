package programmers.java.level0;

import java.util.*;
import java.util.stream.*;

public class E181889 {
    public int[] solution(int[] num_list, int n) {
        return IntStream.of(num_list).limit(n).toArray();
    }

    public static void main(String[] args) {
        System.out.println(new E181889().solution(new int[] { 2, 1, 6 }, 1));
        System.out.println(new E181889().solution(new int[] { 5, 2, 1, 7, 5 }, 3));
    }
}
