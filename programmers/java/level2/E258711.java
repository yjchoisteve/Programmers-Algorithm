package programmers.java.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class E258711 {
    public int[] solution(int[][] edges) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int[] edge : edges) {
            if (!map.containsKey(edge[0])) {
                map.put(edge[0], new ArrayList<>());

            }
            map.get(edge[0]).add(edge[1]);
        }
        int max = 0, start = 0;
        for (int i : map.keySet()) {
            if (max < map.get(i).size()) {
                max = map.get(i).size();
                start = i;
            }
        }
        List<Integer> list = map.get(start);
        int graph = 0, stack = 0, donnut = 0;
        for (int i = 0; i < list.size(); i++) {
            int next = list.get(i);
            int count = 1, main = next;
            while (map.containsKey(next)) {
                if (map.get(next).size() == 1) {
                    count++;
                    next = map.get(next).get(0);
                    if (next == main) {
                        donnut += count / 2;
                        break;
                    }
                } else {
                    stack += count;
                }
            }
        }
        for (int i : map.keySet()) {
            if (i == start) {
                continue;
            }
            int next = list.get(i);
            int count = 1, main = next;
            while (map.containsKey(next)) {
                if (map.get(next).size() == 1) {
                    count++;
                    next = map.get(next).get(0);
                    if (next == main) {
                        donnut += count / 2;
                        break;
                    }
                } else {
                    stack += count;
                }
            }
        }
        int[] answer = { start, stack, donnut };
        return answer;
    }

    public static void main(String[] args) {
        int[] a = new E258711().solution(new int[][] { { 2, 3 }, { 4, 3 }, { 1, 1 }, { 2, 1 } });
        for (int s : a) {
            System.out.println(s);
        }
        System.out.println();
        int[] b = new E258711().solution(new int[][] { { 4, 11 }, { 1, 12 }, { 8, 3 }, { 12, 7 }, { 4, 2 }, { 7, 11 },
                { 4, 8 }, { 9, 6 }, { 10, 11 }, { 6, 10 }, { 3, 5 }, { 11, 1 }, { 5, 3 }, { 11, 9 }, { 3, 8 } });
        for (int s : b) {
            System.out.println(s);
        }
    }
}
