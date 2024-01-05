package programmers.java.level0;

import java.util.Arrays;

public class E120886 {
    public int solution(String before, String after) {
        return Arrays.compare(before.chars().sorted().toArray(), after.chars().sorted().toArray()) == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(new E120886());
    }
}
