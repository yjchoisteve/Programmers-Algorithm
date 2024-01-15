package programmars.java.level1;

import java.util.Arrays;
import java.util.List;

public class E81301 {
    public int solution(String s) {
        List<String> l = Arrays.asList(
                new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" });
        for (int i = 0; i < 10; i++) {
            s = s.replace(l.get(i), String.valueOf(i));
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        System.out.println(new E81301());
    }
}
