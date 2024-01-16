package programmers.java.level1;

import java.util.stream.IntStream;

public class E42840 {
    public int[] solution(int[] answers) {
        int[] scores = new int[3];
        int[][] patterns = { { 1, 2, 3, 4, 5 }, { 2, 1, 2, 3, 2, 4, 2, 5 }, { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 } };
        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < 3; j++) {
                scores[j] += patterns[j][i % patterns[j].length] == answers[i] ? 1 : 0;
            }
        }
        int max = Math.max(Math.max(scores[0], scores[1]), scores[2]);
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (max == scores[i]) {
                scores[i] = 1;
                count++;
            } else {
                scores[i] = 0;
            }
        }
        int[] ret = new int[count];
        for (int i = 0, j = 0; i < 3; i++) {
            if (scores[i] == 1) {
                ret[j++] = i + 1;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] a = new E42840().solution(new int[] { 1, 2, 3, 4, 5 });
        for (int n : a) {
            System.out.println(n);
        }
        System.out.println();
        int[] b = new E42840().solution(new int[] { 1, 3, 2, 4, 2 });
        for (int n : b) {
            System.out.println(n);
        }
    }
}
