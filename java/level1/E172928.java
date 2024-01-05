package programmers.java.level1;

import java.util.Arrays;
import java.util.List;

public class E172928 {
    public int[] solution(String[] park, String[] routes) {
        List<String> l = Arrays.asList(new String[] { "E", "W", "S", "N" });
        int[][] d = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
        int[] c = { -1, -1 };
        for (int i = 0; i < park.length; i++) {
            if (park[i].contains("S")) {
                c[0] = i;
                c[1] = park[i].indexOf("S");
                break;
            }
        }
        for (String route : routes) {
            int[] direction = d[l.indexOf(String.valueOf(route.charAt(0)))];
            int count = Integer.parseInt(String.valueOf(route.charAt(2)));
            boolean isOkay = true;
            for (int i = 1; i <= count; i++) {
                if (c[0] + direction[0] * i >= park.length || c[0] + direction[0] * i < 0
                        || c[1] + direction[1] * i >= park[0].length() || c[1] + direction[1] * i < 0
                        || String.valueOf(park[c[0] + direction[0] * i].charAt(c[1] + direction[1] * i)).equals("X")) {
                    isOkay = false;
                    break;
                }
            }
            if (isOkay) {
                c[0] += direction[0] * count;
                c[1] += direction[1] * count;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(
                new E172928().solution(new String[] { "SOO", "OOO", "OOO" }, new String[] {
                        "E 2", "S 2", "W 1" }));
        System.out.println();
        System.out.println(
                new E172928().solution(new String[] { "SOO", "OXX", "OOO" }, new String[] {
                        "E 2", "S 2", "W 1" }));
        System.out.println();
        System.out.println(
                new E172928().solution(new String[] { "OSO", "OOO", "OXO", "OOO" },
                        new String[] { "E 2", "S 3", "W 1" }));
    }
}
