package programmers.java.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class E258711 {
    public int[] solution(int[][] edges) {
        HashMap<Integer, List<Integer>> outMap = new HashMap<>();
        HashMap<Integer, List<Integer>> inMap = new HashMap<>();
        for (int[] edge : edges) {
            if (!outMap.containsKey(edge[0])) {
                outMap.put(edge[0], new ArrayList<>());
            }
            if (!inMap.containsKey(edge[1])) {
                inMap.put(edge[1], new ArrayList<>());
            }
            outMap.get(edge[0]).add(edge[1]);
            inMap.get(edge[1]).add(edge[0]);
        }
        int max = 0, start = 0;
        for (int i : outMap.keySet()) {
            if (!inMap.containsKey(i) && max < outMap.get(i).size()) {
                max = outMap.get(i).size();
                start = i;
            }
        }
        List<Integer> list = outMap.get(start);
        int graph = 0, bar = 0, donnut = 0;
        for (int next : list) {
            List<Integer> doneList = new ArrayList<>();
            doneList.add(next);
            int lineCount = 0;
            while (outMap.containsKey(next)) {
                int tmp = outMap.get(next).get(0);
                outMap.get(next).remove(0);
                if (outMap.get(next).isEmpty()) {
                    outMap.remove(next);
                }
                lineCount++;
                next = tmp;
                if (!doneList.contains(next)) {
                    doneList.add(next);
                }
            }
            if (doneList.size() - 1 == lineCount) {
                bar++;
            } else if (doneList.size() == lineCount) {
                donnut++;
            } else {
                graph++;
            }
        }
        int[] answer = { start, donnut, bar, graph };
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
