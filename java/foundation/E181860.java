package programmers.java;

import java.util.Arrays;

public class E181860 {
    public int[] solution(int[] arr, boolean[] flag) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                sb.append(String.valueOf(arr[i]).repeat(arr[i] * 2));
            } else {
                sb.delete(sb.length() - arr[i], sb.length());
            }
        }
        return Arrays.asList(sb.toString().split("")).stream().mapToInt(x -> Integer.parseInt(x)).toArray();
    }

    public static void main(String[] args) {
        System.out.println(
                new E181860().solution(new int[] { 3, 2, 4, 1, 3 }, new boolean[] { true, false, true, false, false }));
    }
}
