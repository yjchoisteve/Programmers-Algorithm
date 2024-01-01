package programmers.java;

import java.util.stream.Stream;

public class E120956 {
    public int solution(String[] babbling) {
        return (int) Stream.of(babbling)
                .map(s -> s.replace("aya", "---").replace("ye", "--").replace("woo", "---").replace("ma", "--"))
                .filter(s -> s.equals("-".repeat(s.length()))).count();
    }

    public static void main(String[] args) {
        System.out.println(new E120956().solution(new String[] { "aya", "yee", "u", "maa", "wyeoo" }));
    }
}
