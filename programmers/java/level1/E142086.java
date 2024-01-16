package programmers.java.level1;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class E142086 {
    public int[] solution(String s) {
        Map<String, Integer> m = Stream.of(s.split("")).distinct().collect(HashMap::new,
                (map, e) -> map.put(e, -1), Map::putAll);
        int[] ret = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int idx = m.get(String.valueOf(s.charAt(i)));
            ret[i] = idx == -1 ? -1 : i - idx;
            m.put(String.valueOf(s.charAt(i)), i);
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new E142086());
    }
}
