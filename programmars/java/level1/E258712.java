package programmars.java.level1;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class E258712 {
        public int solution(String[] friends, String[] gifts) {
                Map<String, Map<String, Integer>> m = Stream.of(friends).collect(HashMap::new,
                                (map, value) -> map.put(value,
                                                Stream.of(friends).filter(s -> !s.equals(value)).collect(HashMap::new,
                                                                (map2, value2) -> map2.put(value2, 0), Map::putAll)),
                                Map::putAll);
                Map<String, Integer> m2 = Stream.of(friends).collect(HashMap::new, (map, value) -> map.put(value, 0),
                                Map::putAll);
                for (String s : gifts) {
                        String[] tmp = s.split(" ");
                        m.get(tmp[0]).put(tmp[1], m.get(tmp[0]).get(tmp[1]) + 1);
                        m.get(tmp[1]).put(tmp[0], m.get(tmp[1]).get(tmp[0]) - 1);
                        m2.put(tmp[0], m2.get(tmp[0]) + 1);
                        m2.put(tmp[1], m2.get(tmp[1]) - 1);
                }
                return m.keySet().stream().mapToInt(
                                s -> (int) m.get(s).keySet().stream()
                                                .mapToInt(s2 -> m.get(s).get(s2) == 0 ? m2.get(s) > m2.get(s2) ? 1 : 0
                                                                : m.get(s).get(s2) > 0 ? 1 : 0)
                                                .filter(i -> i > 0)
                                                .count())
                                .max().getAsInt();
        }

        public static void main(String[] args) {
                System.out.println(
                                new E258712().solution(new String[] { "muzi", "ryan", "frodo", "neo" },
                                                new String[] { "muzi frodo",
                                                                "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi",
                                                                "frodo muzi", "frodo ryan", "neo muzi" }));
                System.out.println(
                                new E258712().solution(new String[] { "joy", "brad", "alessandro", "conan",
                                                "david" },
                                                new String[] { "alessandro brad", "alessandro joy", "alessandro conan",
                                                                "david alessandro",
                                                                "alessandro david" }));
        }
}
