package programmers.java.level1;

import java.util.HashSet;
import java.util.Set;

public class E68644 {
    public int[] solution(int[] numbers) {
        Set<Integer> l = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                l.add(numbers[i] + numbers[j]);
            }
        }
        return l.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(new E68644());
    }
}
