package programmers.java;

import java.util.stream.IntStream;

public class E181915 {
    public String solution(String my_string, int[] index_list) {
        StringBuilder str = new StringBuilder();
        IntStream.of(index_list).forEach(x -> str.append(my_string.charAt(x)));
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(
                new E181915().solution("cvsgiorszzzmrpaqpe", new int[] { 16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7 }));
        System.out.println(
                new E181915().solution("zpiaz", new int[] { 1, 2, 0, 0, 3 }));
    }
}
