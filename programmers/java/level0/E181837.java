package programmers.java.level0;

import java.util.Arrays;
import java.util.Scanner;

public class E181837 {
    public int solution(String[] order) {
        return Arrays.asList(order).stream().mapToInt(s -> s.contains("ame") || s.equals("anything") ? 4500 : 5000)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(new E181837());
    }
}
