package programmers.java;

import java.util.StringJoiner;
import java.util.stream.IntStream;

public class E181928 {
    public int solution(int[] num_list) {
        StringJoiner joiner1 = new StringJoiner(""), joiner2 = new StringJoiner("");
        IntStream.of(num_list).filter(i -> i % 2 == 1).forEach(x -> joiner1.add(String.valueOf(x)));
        IntStream.of(num_list).filter(i -> i % 2 == 0).forEach(x -> joiner2.add(String.valueOf(x)));
        return Integer.parseInt(joiner1.toString()) + Integer.parseInt(joiner2.toString());
    }

    public static void main(String[] args) {
        System.out.println(new E181928().solution(new int[] { 3, 4, 5, 2, 1 }));
        System.out.println(new E181928().solution(new int[] { 5, 7, 8, 3 }));
    }
}
