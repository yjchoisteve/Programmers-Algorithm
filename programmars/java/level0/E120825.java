package programmars.java.level0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class E120825 {
    public String solution(String my_string, int n) {
        return Arrays.asList(my_string.split("")).stream().map(s -> s.repeat(n)).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(new E120825());
    }
}
