package programmers.java.level0;

import java.util.Arrays;
import java.util.Scanner;

public class E181870 {
    public String[] solution(String[] strArr) {
        return Arrays.asList(strArr).stream().filter(s -> !s.contains("ad")).toArray(String[]::new);
    }

    public static void main(String[] args) {
        System.out.println(new E181870().solution(new String[] { "and", "notad", "abcd" }));
        System.out.println(new E181870().solution(new String[] { "there", "are", "no", "a", "ds" }));
    }
}
