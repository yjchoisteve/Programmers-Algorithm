package programmers.java.level1;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class E178871 {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> m = IntStream.range(0, players.length).collect(HashMap::new,
                (map, idx) -> map.put(players[idx], idx), Map::putAll);
        for (String call : callings) {
            int idx = m.get(call);
            String tmp = players[idx - 1];
            players[idx - 1] = call;
            players[idx] = tmp;
            m.put(call, idx - 1);
            m.put(tmp, idx);
        }
        return players;
    }

    public static void main(String[] args) {
        System.out.println(new E178871().solution(new String[] { "mumu", "soe", "poe", "kai", "mine" },
                new String[] { "kai", "kai", "mine", "mine" }));
    }
}
