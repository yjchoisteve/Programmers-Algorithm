package programmars.java.level0;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class E120835 {
    public int[] solution(int[] emergency) {
        List<Integer> l = IntStream.of(emergency).boxed().sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        return IntStream.of(emergency).map(i -> l.indexOf(Integer.valueOf(i)) + 1)
                .toArray();
    }

    public static void main(String[] args) {
        for (int solution : new E120835().solution(new int[] { 3, 76, 24 })) {
            System.out.print(solution + " ");
        }
        System.out.println();
        for (int solution : new E120835().solution(new int[] { 1, 2, 3, 4, 5, 6, 7 })) {
            System.out.print(solution + " ");
        }
        System.out.println();
        for (int solution : new E120835().solution(new int[] { 30, 10, 23, 6, 100 })) {
            System.out.print(solution + " ");
        }
        System.out.println();
    }
}
