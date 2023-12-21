package programmers.java;

import java.util.stream.IntStream;

public class E181890 {
    public String[] solution(String[] str_list) {
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                return IntStream.range(0, i).mapToObj(x -> str_list[x]).toArray(String[]::new);
            } else if (str_list[i].equals("r")) {
                return IntStream.range(i + 1, str_list.length).mapToObj(x -> str_list[x]).toArray(String[]::new);
            }
        }
        return new String[] {};
    }

    public static void main(String[] args) {
        for (String solution : new E181890().solution(new String[] { "u", "u", "l", "r" })) {
            System.out.print(solution + " ");
        }
        System.out.println();
        for (String solution : new E181890().solution(new String[] { "l" })) {
            System.out.print(solution + " ");
        }
    }
}
