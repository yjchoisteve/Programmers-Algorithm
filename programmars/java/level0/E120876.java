package programmars.java.level0;

import java.util.stream.IntStream;

public class E120876 {
    public int solution(int[][] lines) {
        int[] l = new int[200];
        for (int i = 0; i < lines.length; i++) {
            for (int j = lines[i][0] + 100; j < lines[i][1] + 100; j++) {
                l[j]++;
            }
        }
        return (int) IntStream.of(l).filter(i -> i > 1).count();
    }

    public static void main(String[] args) {
        // System.out.println(new E120876().solution(new int[][] { { 0, 1 }, { 2, 5 }, {
        // 3, 9 } }));
        System.out.println(new E120876().solution(new int[][] { { 0, 5 }, { 3, 9 }, { 1, 10 } }));
        // System.out.println(new E120876().solution(new int[][] { { 0, 1 }, { 2, 5 }, {
        // 3, 9 } }));
    }
}
