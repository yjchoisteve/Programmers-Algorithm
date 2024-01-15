package programmars.java.level1;

import java.util.stream.Stream;

public class E133499 {
    public int solution(String[] babbling) {
        String[] filters = { "aya", "ye", "woo", "ma" };
        return (int) Stream.of(babbling).filter(s -> {
            for (String tmp : filters) {
                if (s.contains(tmp.repeat(2))) {
                    return false;
                }
            }
            return true;
        }).map(s -> {
            for (String tmp : filters) {
                s = s.replace(tmp, "-".repeat(tmp.length()));
            }
            return s;
        }).filter(s -> s.equals("-".repeat(s.length()))).count();
    }

    public static void main(String[] args) {
        System.out.println(new E133499());
    }
}
