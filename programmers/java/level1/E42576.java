package programmers.java.level1;

import java.util.HashMap;

public class E42576 {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> m = new HashMap<>();
        for (String p : participant) {
            m.put(p, m.getOrDefault(p, 0) + 1);
        }
        for (String p : completion) {
            if (m.get(p) - 1 == 0) {
                m.remove(p);
            } else {
                m.put(p, m.get(p) - 1);
            }
        }
        return m.keySet().iterator().next();
    }

    public static void main(String[] args) {
        System.out.println(
                new E42576().solution(new String[] { "leo", "kiki", "eden" }, new String[] { "eden", "kiki" }));
    }
}
