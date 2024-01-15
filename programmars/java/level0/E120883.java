package programmars.java.level0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class E120883 {
    public String solution(String[] id_pw, String[][] db) {
        Map<String, String> m = Arrays.stream(db).collect(HashMap::new,
                (map, array) -> map.put(array[0], array[1]), Map::putAll);
        if (m.keySet().contains(id_pw[0])) {
            if (m.get(id_pw[0]).equals(id_pw[1])) {
                return "login";
            } else {
                return "wrong pw";
            }
        } else {
            return "fail";
        }
    }

    public static void main(String[] args) {
        System.out.println(new E120883());
    }
}
