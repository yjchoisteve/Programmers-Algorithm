package programmers.java;

import java.util.List;
import java.util.ArrayList;

public class E181888 {
    public int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num_list.length; i += n) {
            list.add(Integer.valueOf(num_list[i]));
        }
        return list.stream().mapToInt(x -> x).toArray();
    }

    public static void main(String[] args) {
        System.out.println(new E181888().solution(new int[] { 4, 2, 6, 1, 7, 6 }, 2));
        System.out.println(new E181888().solution(new int[] { 4, 2, 6, 1, 7, 6 }, 4));
    }
}
