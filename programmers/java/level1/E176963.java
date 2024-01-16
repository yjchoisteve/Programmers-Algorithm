package programmers.java.level1;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class E176963 {
        public int[] solution(String[] name, int[] yearning, String[][] photo) {
                Map<String, Integer> m = IntStream.range(0, name.length).collect(HashMap::new,
                                (map, idx) -> map.put(name[idx], yearning[idx]), Map::putAll);
                return Stream.of(photo).mapToInt(e -> Stream.of(e).mapToInt(i -> m.getOrDefault(i, 0)).sum())
                                .toArray();
        }

        public static void main(String[] args) {
                System.out.println(new E176963().solution(new String[] { "may", "kein", "kain", "radi" },
                                new int[] { 5, 10, 1, 3 }, new String[][] { { "may", "kein", "kain", "radi" },
                                                { "may", "kein", "brin", "deny" }, { "kon", "kain", "may", "coni" } }));
        }
}
