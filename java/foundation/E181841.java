package programmers.java.foundation;

import java.util.Arrays;
import java.util.stream.Collectors;

public class E181841 {
    public String solution(String[] str_list, String ex) {
        return String.join("",
                Arrays.asList(str_list).stream().filter(x -> !x.contains(ex)).collect(Collectors.toList()));
    }

    public static void main(String[] args) {
        System.out.println(new E181841().solution(new String[] { "abc", "def", "ghi" }, "ef"));
        System.out.println(new E181841().solution(new String[] { "abc", "bbc", "cbc" }, "c"));
    }
}
