package programmars.java.level1;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class E42889 {
    public int[] solution(int N, int[] stages) {
        int[] failedList = new int[N], touchedList = new int[N];
        double[] rates = new double[N];
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] == i) {
                    failedList[i - 1]++;
                }
                if (stages[j] >= i) {
                    touchedList[i - 1]++;
                }
            }
            System.out.println(failedList[i - 1] + " - " + touchedList[i - 1]);
            if (touchedList[i - 1] > 0) {
                rates[i - 1] = ((double) failedList[i - 1]) / touchedList[i - 1];
            }
        }
        return IntStream.rangeClosed(1, N).boxed().sorted((n1, n2) -> {
            if (rates[n1.intValue() - 1] > rates[n2.intValue() - 1]) {
                return -1;
            }
            return 1;
        }).mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        // 1 2 2 2 3 3 4 6
        for (int solution : new E42889().solution(5, new int[] { 2, 1, 2, 6, 2, 4, 3, 3 })) {
            System.out.print(solution + " ");
        }
        System.out.println();
        for (int solution : new E42889().solution(4, new int[] { 4, 4, 4, 4, 4 })) {
            System.out.print(solution + " ");
        }
    }
}
