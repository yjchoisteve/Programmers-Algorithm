package programmers.java.level1;

import java.util.HashMap;

public class E1845 {
    public int solution(int[] nums) {
        HashMap<Integer, Long> m = new HashMap<>();
        for (int n : nums) {
            m.put(Integer.valueOf(n), m.getOrDefault(Integer.valueOf(n), 0l) + 1);
        }
        return Math.min(nums.length / 2, m.keySet().size());
    }

    public static void main(String[] args) {
        System.out.println(new E1845().solution(new int[] { 3, 1, 2, 3 }));
        System.out.println(new E1845().solution(new int[] { 3, 3, 3, 2, 2, 4 }));
        System.out.println(new E1845().solution(new int[] { 3, 3, 3, 2, 2, 2 }));
    }
}
