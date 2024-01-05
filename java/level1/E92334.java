package programmers.java.level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class E92334 {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Integer> m = Stream.of(id_list)
                .collect(Collectors.toMap(s -> s, s -> 0));
        Map<String, List<String>> m2 = Stream.of(id_list)
                .collect(Collectors.toMap(s -> s, s -> new ArrayList<String>()));
        Stream.of(report).distinct().forEach(e -> {
            String[] tmp = e.split(" ");
            int count = m.get(tmp[1]) + 1;
            m.put(tmp[1], count);
            if (m2.get(tmp[1]).contains(tmp[0])) {
                m2.get(tmp[1]).add(tmp[0]);
            }
        });
        return Stream.of(id_list)
                .mapToInt(s -> (int) Stream.of(id_list)
                        .filter(s2 -> m2.get(s2).contains(s) && m.get(s2) >= k).count())
                .toArray();
    }

    public static void main(String[] args) {
        System.out.println(new E92334().solution(new String[] { "muzi", "frodo", "apeach", "neo" },
                new String[] { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" }, 2));
    }
}
