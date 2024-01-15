package programmars.java.level1;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class E118666 {
    public String solution(String[] survey, int[] choices) {
        Map<String, Integer> m = new HashMap<>();
        IntStream.range(0, survey.length).forEach(i -> {
            int choice = choices[i] - 4;
            String a = survey[i].substring(0, 1);
            String b = survey[i].substring(1);
            if (choice < 0) {
                m.put(a, m.getOrDefault(a, 0) + Math.abs(choice));
            } else {
                m.put(b, m.getOrDefault(b, 0) + choice);
            }
        });
        StringBuilder sb = new StringBuilder();
        sb.append(m.getOrDefault("R", 0) >= m.getOrDefault("T", 0) ? "R" : "T");
        sb.append(m.getOrDefault("C", 0) >= m.getOrDefault("F", 0) ? "C" : "F");
        sb.append(m.getOrDefault("J", 0) >= m.getOrDefault("M", 0) ? "J" : "M");
        sb.append(m.getOrDefault("A", 0) >= m.getOrDefault("N", 0) ? "A" : "N");
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new E118666());
    }
}
